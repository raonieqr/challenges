import json

class Person:
  def __init__(self, name, age) -> None:
    self.name = name
    self.age = age

  def get_name(self):
        return self.name
  def get_age(self):
        return self.age

def writes_file(lst):
  try:
    with open('class.json', 'w') as file:
      json.dump(
        lst.__dict__,
        file,
        indent=2
      )
  except FileNotFoundError:
    print("Error: File 'class.json' not found")
  except IOError:
    print("Error: Unable to write to file")

def reads_file():
  try:
    with open('class.json', 'r') as file:
     tasks = json.load(file)
         
    return tasks["name"], tasks["age"]
  except FileNotFoundError:
    print("Error: File 'class.json' not found")
    return []

if __name__ == "__main__":
    p1 = Person("Raoni", 25)
    writes_file(p1)
    lst = reads_file()
    p2 = Person(lst[0], lst[1])
    print(p2.get_name(), p2.get_age())
