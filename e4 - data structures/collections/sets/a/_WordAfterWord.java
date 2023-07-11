package com.nbicocchi.exercises.collections.sets.a;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;


public class _WordAfterWord {

    //  Custom thing instead of using a book to get some words
    public static String getSourceText() {
        String src_url = "https://www.nobelprize.org/prizes/physics/1921/einstein/biographical/";

        return "lbert Einstein was born at Ulm, in Württemberg, Germany, on March 14, 1879. Six weeks later the family moved to Munich, where he later on began his schooling at the Luitpold Gymnasium. Later, they moved to Italy and Albert continued his education at Aarau, Switzerland and in 1896 he entered the Swiss Federal Polytechnic School in Zurich to be trained as a teacher in physics and mathematics. In 1901, the year he gained his diploma, he acquired Swiss citizenship and, as he was unable to find a teaching post, he accepted a position as technical assistant in the Swiss Patent Office. In 1905 he obtained his doctor’s degree.\n" +
                "\n" +
                "During his stay at the Patent Office, and in his spare time, he produced much of his remarkable work and in 1908 he was appointed Privatdozent in Berne. In 1909 he became Professor Extraordinary at Zurich, in 1911 Professor of Theoretical Physics at Prague, returning to Zurich in the following year to fill a similar post. In 1914 he was appointed Director of the Kaiser Wilhelm Physical Institute and Professor in the University of Berlin. He became a German citizen in 1914 and remained in Berlin until 1933 when he renounced his citizenship for political reasons and emigrated to America to take the position of Professor of Theoretical Physics at Princeton*. He became a United States citizen in 1940 and retired from his post in 1945.\n" +
                "\n" +
                "After World War II, Einstein was a leading figure in the World Government Movement, he was offered the Presidency of the State of Israel, which he declined, and he collaborated with Dr. Chaim Weizmann in establishing the Hebrew University of Jerusalem.\n" +
                "\n" +
                "Einstein always appeared to have a clear view of the problems of physics and the determination to solve them. He had a strategy of his own and was able to visualize the main stages on the way to his goal. He regarded his major achievements as mere stepping-stones for the next advance.\n" +
                "\n" +
                "At the start of his scientific work, Einstein realized the inadequacies of Newtonian mechanics and his special theory of relativity stemmed from an attempt to reconcile the laws of mechanics with the laws of the electromagnetic field. He dealt with classical problems of statistical mechanics and problems in which they were merged with quantum theory: this led to an explanation of the Brownian movement of molecules. He investigated the thermal properties of light with a low radiation density and his observations laid the foundation of the photon theory of light.\n" +
                "\n" +
                "In his early days in Berlin, Einstein postulated that the correct interpretation of the special theory of relativity must also furnish a theory of gravitation and in 1916 he published his paper on the general theory of relativity. During this time he also contributed to the problems of the theory of radiation and statistical mechanics.\n" +
                "\n" +
                "In the 1920s, Einstein embarked on the construction of unified field theories, although he continued to work on the probabilistic interpretation of quantum theory, and he persevered with this work in America. He contributed to statistical mechanics by his development of the quantum theory of a monatomic gas and he has also accomplished valuable work in connection with atomic transition probabilities and relativistic cosmology.\n" +
                "\n" +
                "After his retirement he continued to work towards the unification of the basic concepts of physics, taking the opposite approach, geometrisation, to the majority of physicists.\n" +
                "\n" +
                "Einstein’s researches are, of course, well chronicled and his more important works include Special Theory of Relativity (1905), Relativity (English translations, 1920 and 1950), General Theory of Relativity (1916), Investigations on Theory of Brownian Movement (1926), and The Evolution of Physics (1938). Among his non-scientific works, About Zionism (1930), Why War? (1933), My Philosophy (1934), and Out of My Later Years (1950) are perhaps the most important.\n" +
                "\n" +
                "Albert Einstein received honorary doctorate degrees in science, medicine and philosophy from many European and American universities. During the 1920’s he lectured in Europe, America and the Far East, and he was awarded Fellowships or Memberships of all the leading scientific academies throughout the world. He gained numerous awards in recognition of his work, including the Copley Medal of the Royal Society of London in 1925, and the Franklin Medal of the Franklin Institute in 1935.\n" +
                "\n" +
                "Einstein’s gifts inevitably resulted in his dwelling much in intellectual solitude and, for relaxation, music played an important part in his life. He married Mileva Maric in 1903 and they had a daughter and two sons; their marriage was dissolved in 1919 and in the same year he married his cousin, Elsa Löwenthal, who died in 1936. He died on April 18, 1955 at Princeton, New Jersey.";
    }

    //  Transform into a List<String>
    public static List<String> getLinesList() {
        return Arrays.asList(getSourceText().split("\n"));
    }

    //  Split a line into a listo of single words
    public static List<String> lineToWords(String line) {
        return Arrays.asList(line.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+"));
    }

    public static String wordAfterWord(String targetWord) {
        TreeSet<String> book = new TreeSet<>();
        for (String line : getLinesList())
            book.addAll(lineToWords(line));

        String nextWord = book.tailSet(targetWord).first();
        return nextWord;
    }
}
