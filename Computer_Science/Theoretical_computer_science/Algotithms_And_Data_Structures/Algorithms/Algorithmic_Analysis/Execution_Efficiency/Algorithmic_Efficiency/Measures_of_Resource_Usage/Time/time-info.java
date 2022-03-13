package Computer_Science.Theoretical_computer_science.Algotithms_And_Data_Structures.Algorithms.Algorithmic_Analysis.Execution_Efficiency.Algorithmic_Efficiency.Measures_of_Resource_Usage.Time;
/*
Time

    Theory:
        Analyze the algorithm, typically using time complexity analysis to get an estimate of:
            the running time as a function of the size of the input data.
        The result is normally expressed using Big O notation.----------------------------------------------------------
        This is useful for comparing algorithms, especially when a large amount of data is to be processed. More detailed
        estimates are needed to compare algorithm performance when the amount of data is small, although this is likely
        to be of less importance.
        Algorithms which include parallel processing may be more difficult to analyze.

    Practice:
        Use a benchmark ------------------------------------------------------------------------------------------------
            to time the use of an algorithm. Many programming languages have an available function which provides CPU
            time usage. For long-running algorithms the elapsed time could also be of interest. Results should generally
            be averaged over several tests.

        Run-based profiling --------------------------------------------------------------------------------------------
             can be very sensitive to hardware configuration and the possibility of other programs or tasks running at
             the same time in a multi-processing and multi-programming environment.

    This sort of test also depends heavily on the selection of a particular programming language, compiler, and compiler
    options, so algorithms being compared must all be implemented under the same conditions.



*/