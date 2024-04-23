class Kata {
    static def arrayDiff(a, b) {
      def arr = []
      for (int i = 0; i < a.size(); i++) {
          if (!b.contains(a[i]))
              arr.add(a[i])
      }
      return arr
    }
}
