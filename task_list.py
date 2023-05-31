import json

def writes_file(lst):
  try:
    with open('task_list.json', 'w') as file:
      json.dump(
        lst,
        file,
        indent=2
      )
  except FileNotFoundError:
    print("Error: File 'task_list.json' not found")
  except IOError:
    print("Error: Unable to write to file")

def reads_file():
  try:
    with open('task_list.json', 'r') as file:
     tasks = json.load(file)
     [print(i) for i in tasks]
  except FileNotFoundError:
    print("Error: File 'task_list.json' not found")

def redo_file(lst, tmp):
  if len(tmp) == 0:
    print("There's nothing left to redo")
  else:
    lst.append(tmp.pop())
    writes_file(lst)

def undo_file(lst, tmp):
  if len(lst) == 0:
    print("Cannot undo this list because it is empty")
  else:
    tmp.append(lst.pop())
    writes_file(lst)

def view_file(lst):
  if len(lst) == 0:
    print("Your task list is empty")
  else:
    reads_file()

print("Possible commands: view, redo, and undo")
actions = input("Enter a command or task: ").lower()
lst = []
tmp = []
while actions != "exit": 
  if actions == "view":
    view_file(lst)
  elif actions == "undo":
    undo_file(lst, tmp)
  elif actions == "redo":
    redo_file(lst, tmp)
  else:
    lst.append(actions)
    writes_file(lst)
  actions = input("Enter a command or task: ").lower()
