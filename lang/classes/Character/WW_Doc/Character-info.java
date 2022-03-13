package lang.classes.Character.WW_Doc;

// https://docs.oracle.com/javase/8/docs/api/java/lang/Character.html

class Character_RT {
    Character classLoader;
}

/*                     public final class Character extends lang.classes.Object implements Serializable, Comparable<Character>

https://www.tutorialspoint.com/java/java_characters.htm


    The Character class wraps a value of the primitive type char in an object. An object of class Character contains a
        single field whose type is char.
    In addition, this class provides a large number of static methods for determining a character's category (lowercase
    letter, digit, etc.) and for converting characters from uppercase to lowercase and vice versa.

    Unicode Conformance

        The fields and methods of class Character are defined in terms of character information from the Unicode Standard,
        specifically the UnicodeData file that is part of the Unicode Character Database. This file specifies properties
        including name and category for every assigned Unicode code point or character range. The file is available from
        the Unicode Consortium at http://www.unicode.org.

    The Java SE 8 Platform uses character information from version 6.2 of the Unicode Standard, with two extensions. First,
    the Java SE 8 Platform allows an implementation of class Character to use the Japanese Era code point, U+32FF, from
    the first version of the Unicode Standard after 6.2 that assigns the code point. Second, in recognition of the fact
    that new currencies appear frequently, the Java SE 8 Platform allows an implementation of class Character to use the
    Currency Symbols block from version 10.0 of the Unicode Standard. Consequently, the behavior of fields and methods
    of class Character may vary across implementations of the Java SE 8 Platform when processing the aforementioned code
    points ( outside of version 6.2 ), except for the following methods that define Java identifiers: isJavaIdentifierStart(int),
    isJavaIdentifierStart(char), isJavaIdentifierPart(int), and isJavaIdentifierPart(char). Code points in Java identifiers
    must be drawn from version 6.2 of the Unicode Standard.

    Unicode Character Representations

        The char data type (and therefore the value that a Character object encapsulates) are based on the original
        Unicode specification, which defined characters as fixed-width 16-bit entities. The Unicode Standard has since
        been changed to allow for characters whose representation requires more than 16 bits. The range of legal code
        points is now U+0000 to U+10FFFF, known as Unicode scalar value. (Refer to the definition of the U+n notation
        in the Unicode Standard.)

    The set of characters from U+0000 to U+FFFF is sometimes referred to as the Basic Multilingual Plane (BMP).
       Characters whose code points are greater than U+FFFF are called supplementary characters. The Java platform uses
       the UTF-16 representation in char arrays and in the String and StringBuffer classes. In this representation, supplementary
       characters are represented as a pair of char values, the first from the high-surrogates range, (\uD800-\uDBFF), the
       second from the low-surrogates range (\uDC00-\uDFFF).

    A char value, therefore, represents Basic Multilingual Plane (BMP) code points, including the surrogate code points,
        or code units of the UTF-16 encoding. An int value represents all Unicode code points, including supplementary
        code points. The lower (least significant) 21 bits of int are used to represent Unicode code points and the upper
        (most significant) 11 bits must be zero. Unless otherwise specified, the behavior with respect to supplementary
        characters and surrogate char values is as follows:

        The methods that only accept a char value cannot support supplementary characters. They treat char values from
            the surrogate ranges as undefined characters. For example, Character.isLetter('\uD840') returns false, even
            though this specific value if followed by any low-surrogate value in a string would represent a letter.
        The methods that accept an int value support all Unicode characters, including supplementary characters. For example,
            Character.isLetter(0x2F81A) returns true because the code point value represents a letter (a CJK ideograph).
    In the Java SE API documentation, Unicode code point is used for character values in the range between U+0000 and U+10FFFF,
        and Unicode code unit is used for 16-bit char values that are code units of the UTF-16 encoding. For more information
        on Unicode terminology, refer to the Unicode Glossary.

    Since:
    1.0
    See Also:
    Serialized Form


    RELATED

    https://www.javatpoint.com/post/java-character

   https://www.geeksforgeeks.org/character-class-java/

 */