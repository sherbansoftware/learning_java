package Collections_.miscelanous.Interfaces.Set_interface.Symmetric_and_Assymetric;

//------------------------------------------ Union of two sets --------------------------------------------------

        //s1.addAll(s2) — transforms s1 into the union of s1 and s2.
        //The union of two sets is the set containing all of the elements contained in either set.

//------------------------------------------ Intersection of two sets --------------------------------------------------

            // Given sets-----------------------------------------------------------------------------------------------

//        Set<Character> ab = new HashSet<Character>(Arrays.asList('a', 'b'));
//        Set<Character> bc = new HashSet<Character>(Arrays.asList('b', 'c'));

           // Intersection of two sets----------------------------------------------------------------------------------

//        Set<Character> intersection = new HashSet<Character>(ab);
//        intersection.retainAll(bc);                     // -> [b]

//------------------------------------------ symmetric set difference of s1 and s2-------------------------------------

//         the set of elements contained in either of two specified sets but not in both
//           s1.addAll(s2);
//           s1.retainAll(s2);
//           s1.removeAll(s2);

//------------------------------------------ asymmetric set difference of s1 and s2-------------------------------------

          // s1.removeAll(s2)
          // the set difference of s1 minus s2 is the set containing all of the elements found in s1 but not in s2.