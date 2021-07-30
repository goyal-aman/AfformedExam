import java.util.*;

public interface CompressionDecompression {
    /**
     *  Idea is we can use trie to save space on 
     * repeating characters and words. 
     * 
     * We will need to keep track of ending word along with index of that word.
     * 
     * example: "I am aman.I do leetcode "
     *                    (root)
     *       I            a           d          i(end, [0,4])  l   .(end,3)
     *                  m(end, 1)     o(end,5)                  e
     *                 a                                        e
     *                n(end, 2)                                 t
     *                                                          c
     *                                                          o
     *                                                          d
     *                                                          e(end, 6)
                           /

    **/ 
        }
