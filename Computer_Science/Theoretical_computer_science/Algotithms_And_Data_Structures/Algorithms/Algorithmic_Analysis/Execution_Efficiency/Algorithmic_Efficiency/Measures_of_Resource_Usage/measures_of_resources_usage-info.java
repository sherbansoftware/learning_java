package Computer_Science.Theoretical_computer_science.Algotithms_And_Data_Structures.Algorithms.Algorithmic_Analysis.Execution_Efficiency.Algorithmic_Efficiency.Measures_of_Resource_Usage;
/*
                                              Measures of resource usage
        Measures are normally expressed as a function of the size of the input n.

        The two most common measures are:

    Time: --------------------------------------------------------------------------------------------------------------
        how long does the algorithm take to complete?
    Space: -------------------------------------------------------------------------------------------------------------
         how much working memory (typically RAM) is needed by the algorithm?
         This has two aspects:

            1.Amount of memory needed by the code (auxiliary space usage),
            2.Amount of memory needed for the data on which the code operates (intrinsic space usage).

         For computers whose power is supplied by a battery (e.g. laptops and smartphones), or for very long/large calculations
         (e.g. supercomputers), other measures of interest are:

    Direct power consumption: ------------------------------------------------------------------------------------------
        power needed directly to operate the computer.
    Indirect power consumption: ----------------------------------------------------------------------------------------
        power needed for cooling, lighting, etc.
    As of 2018, power consumption is growing as an important metric for computational tasks of all types and at all
    scales ranging from embedded Internet of things devices to system-on-chip devices to server farms. This trend is often
    referred to as green computing.

        Less common measures of computational efficiency may also be relevant in some cases:

    Transmission size: -------------------------------------------------------------------------------------------------
        bandwidth could be a limiting factor. Data compression can be used to reduce the amount of data to be transmitted.
        Displaying a picture or image (e.g. Google logo) can result in transmitting tens of thousands of bytes
        (48K in this case) compared with transmitting six bytes for the text "Google". This is important for I/O bound
        computing tasks.
    External space: ----------------------------------------------------------------------------------------------------
        space needed on a disk or other external memory device; this could be for temporary storage while the algorithm
        is being carried out, or it could be long-term storage needed to be carried forward for future reference.
    Response time (latency): -------------------------------------------------------------------------------------------
        this is particularly relevant in a real-time application when the computer system must respond quickly to some
        external event.
    Total cost of ownership: -------------------------------------------------------------------------------------------
        particularly if a computer is dedicated to one particular algorithm.

*/