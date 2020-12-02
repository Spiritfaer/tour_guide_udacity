package com.example.tour_guide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ParkFragment extends Fragment {

    private final ArrayList<Article> articles;

    {
        articles = new ArrayList<>();

        articles.add(new Article(
                "PARK OF CULTURE AND RECREATION THEM. T. G. SHEVCHENKO",
                "Park of Culture and Rest named after T.G. Shevchenko (from 1790s to 1925 - Potemkin Garden) - the central park of culture and recreation in Dnepropetrovsk.\n\n" +
                "One of the two main garden and park complexes of Yekaterinoslav - Dnepropetrovsk (along with the park of Lazar Globa).\n\n" +
                "It was founded at the end of the 18th century on the site of the winter quarters of the Zaporizhzhya chieftain Lazar Globa, which had an extensive orchard.\n\n" +
                "In the 1790s. on the site of the garden and adjacent free territories of the hill, a palace and park ensemble of the residence of G.A. Potemkin was created - the Potemkin Palace, now the Palace of Students of the DNU, architect I. Ye. Starov, the English park - landscape designer V. Guld (Englishman by origin).\n\n" +
                "In the second half of the XIX - early XX centuries. the park served as one of the main resting places of Yekaterinoslav residents. As a result of the reconstruction of 1925 - mid-1930s. turned into \"T. G. Shevchenko Park of Culture and Rest\". The last major reconstruction of the park was carried out in 1971-1974. Since 1990 it has been a national park-monument of gardening art.\n\n" +
                "The area of \u200B\u200Bthe park together with the Komsomolsky (Monastyrsky) island is 36 hectares. It is divided into coastal and island parts.\n\n" +
                "Onshore part: Summer Theater, Palace of Students of DNU (formerly Potemkin Palace), several playgrounds.\n\n" +
                "Monastyrsky Island. A pedestrian bridge and a cable car (from Danila Nechaya street) are thrown to the island. On the island there are: Aquarium of freshwater fish, a zoo, attractions, several water sports clubs and bases where you can rent a boat. There are beaches at the bottom of the island.",
                R.drawable.park_kultury_y_otdykha_ym_t_h_shevchenko));
        articles.add(new Article(
                "PARK OF THE 40th ANNIVERSARY OF THE LIBERATION OF DNEPROPETROVSK",
                "The park of the 40th anniversary of the liberation of Dnepropetrovsk (the park is a military cemetery) is a place of large burials of civilians and Soviet soldiers during the Great Patriotic War.\n\n" +
                        "Every resident of the city of Dnepropetrovsk knows the place well - where the Zaporozhye highway and Heroes of Stalingrad street intersect. Right at the “Razvilka” there is a park “named after the 40th anniversary of the liberation of Dnepropetrovsk”. Even before the October Revolution of 1917, the first burial was made here, in the 60s - the last. Mass burials of soldiers of the Great Patriotic War took place here. Today, graves, a huge military necropolis, 2076 Red Army soldiers who died in battles or died from wounds in 1943-1946 have survived. Half of the graves are unnamed.\n\n" +
                        "Located: Dnepropetrovsk, at the intersection of the Zaporozhye highway and Heroes of Stalingrad street.\n\n" +
                        "Among the shady trees in the park is the only surviving grave - the famous architect of Dnepropetrovsk Alexander Leontyevich Krasnoselsky (1877 - 1944). He created many buildings that we are proud of and admire now - the Central Department Store, Children's World, the Gorky Theater, the second building of the university, the building of the medical institute on Sevastopolskaya Street, the reconstructed building of the regional council, the Ilyich Palace on Kalinin Avenue and many others.\n\n" +
                        "In 1982, at the request of local historians, a new monument was erected on the architect's grave in a closed cemetery. This is a granite column, entwined with a metal tape with an inscription and a portrait of the architect (authors - architect E.V. Amosov, sculptor V.I. Muzyko).",
                R.drawable.park_40_letyia_osvobozhdenyia_dnepropetrovska
        ));
        articles.add(new Article(
                "SQUARE NAMED AFTER VOLODI DUBININ",
                "Dubinin Vladimir Nikiforovich (1928 - 1942) - pioneer - hero.\n\n" +
                        "Volodya Dubinin was one of the members of the partisan detachment that fought in the quarries of the Old Quarantine (Kamysh Burun) near Kerch. Pioneers Volodya Dubinin, Vanya Gritsenko and Tolya Kovalev fought together with the adults in the detachment. They brought ammunition, water, food, went on reconnaissance. The invaders fought with a detachment based in the quarries, including bricking up the exits from them. Since Volodya was the smallest, he managed to get to the surface through very narrow manholes, not noticed by the enemies.\n\n" +
                        "After the liberation of Kerch as a result of the Kerch-Feodosia landing operation of 1941-1942, Volodya Dubinin volunteered to help the sappers in clearing the approaches to the quarries. The mine explosion killed the sapper and Volodya Dubinin, who helped him.\n\n" +
                        "Young scout Volodya Dubinin was posthumously awarded the Order of the Red Banner.\n\n" +
                        "Volodya Dubinin was buried in a partisan grave, not far from the quarries.",
                R.drawable.skver_ymeny_volody_dubynyna
        ));
        articles.add(new Article(
                "SEVASTOPOL PARK",
                "Dnepropetrovsk Sevastopol Park was founded in 1955 in honor of the 100th anniversary of the heroic defense of Sevastopol. A monument to the heroes of the Sevastopol defense was erected on the main alley of the park.\n\n" +
                        "More than 150 years ago, there was a cemetery on the site of the Sevastopol Park. Here soldiers and officers of the Russian army were buried, who died in a local hospital from wounds received during the defense of Sevastopol during the Crimean War of 1853-1856. According to Dnepropetrovsk historians and ethnographers, more than forty thousand heroes of the Russian-Turkish war are buried here.\n\n" +
                        "In 1863, a small chapel was built at the cemetery, but soon, in October of the same year, Emperor Alexander visited Yekaterinoslav, and on his personal order the chapel was rebuilt and consecrated in honor of the holy righteous Lazar the Four-Day. In the 30s of the 20th century, the church was closed and partially destroyed.\n\n" +
                        "In 1893, on the territory of the future Sevastopol Park, the Ukrainian poet - democrat Ivan Ivanovich Manzhura (1851-1893) was buried.\n\n" +
                        "During the Great Patriotic War, the cemetery was destroyed and reconstructed in 1956.\n\n" +
                        "A mound with a monument became a monument to those who fell during the defense of Sevastopol.\n\n" +
                        "In 1977, the Sevastopol Park was given the memorial status. However, during the years of Ukraine's independence, the memorial fell into disrepair.\n\n" +
                        "On May 3, 2008, on the day of celebration of Victory Day and the 225th anniversary of Sevastopol, the grand opening of the Sevastopol Memorial Park took place in Dnepropetrovsk.",
                R.drawable.sevastopolskyi_park
        ));
        articles.add(new Article(
                "PARK NAMED AFTER BOGDAN KHMELNYTSKY",
                "Park named after Bohdan Khmelnitsky in Dnepropetrovsk is located between Zaporozhskoe highway and Vakulenchuk street, has turned into a green recreation area, where parents with small children now walk.\n\n" +
                        "Location: Dnepropetrovsk, Heroes of Stalingrada street, 25, between Zaporozhskoe highway and Vakulenchuk street.\n\n" +
                        "Deputies of the Dnipropetrovsk City Council at a regular session made a decision on the improvement of the Bohdan Khmelnytsky Park. The renovated park is scheduled to open in spring 2012.\n\n" +
                        "Park named after Bohdan Khmelnitsky will be landscaped and installed lighting.\n\n" +
                        "It is planned to place on the territory of the park:\n\n" +
                        "volleyball court,\n" +
                        "basketball court,\n" +
                        "tennis courts,\n" +
                        "free rides,\n" +
                        "playground,\n" +
                        "paid rides.\n" +
                        "In the rest of the territory, green spaces will be planted, paths will be laid, flower beds will be laid out and benches will be installed.\n\n" +
                        "It was decided to make the park named after Bohdan Khmelnytsky a green zone, where you can go in for sports, just relax in nature.",
                R.drawable.park_ymeny_bohdana_khmelnytskoho
        ));
        articles.add(new Article(
                "SQUARE OF HEROES",
                "After the liquidation of the MOPR, the park became known as the V.I.Lenin Square. The major reconstruction of the V.I.Lenin public garden came at the beginning of the seventies. As a result of the reconstruction, new alleys and paths appeared, part of the trees were replaced, a playground was laid out, and a fountain was built in the center of the park.\n\n" +
                        "In 1972, a stele of red polished granite was installed at the end of the alley facing Pushkin Avenue. On it is a bas-relief of V. I. Lenin and the inscription \"The victory of communism is inevitable ...\".\n\n" +
                        "Opposite the stele, on the opposite side of the alley, on May 18, 1977, the regional honor board was opened.\n\n" +
                        "In the park named after V.I.Lenin on April 26, 2001, to the 15th anniversary of the Chernobyl disaster, a memorial to the victims of the tragedy was opened.\n\n" +
                        "In February 2003, a high relief with a portrait of Vladimir Shcherbitsky (1918-1990) was installed on the building of the regional council in honor of his 85th birthday.\n\n" +
                        "Much in the park named after V.I.Lenin has already been reconstructed:\n\n" +
                        "playground;\n\n" +
                        "Reconstructed Fan - areas where football fans gather before the match,\n\n" +
                        "installed video surveillance system.",
                R.drawable.skver_heroev
        ));
    }

    public ParkFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.item_list, container, false);

        //find a listView to fills with our articles
        ListView listView = rootView.findViewById(R.id.item_list_id);

        if (getActivity() != null) {
            //Create our adapter
            ArticleAdapter adapter = new ArticleAdapter(getActivity(), R.layout.item, articles);
            //Link listView and adapter
            listView.setAdapter(adapter);
        }

        return rootView;
    }
}
