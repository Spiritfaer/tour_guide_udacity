package com.example.tour_guide;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class ArchitectureFragment extends Fragment {

    private final ArrayList<Article> articles;

    {
        articles = new ArrayList<>();

        articles.add(new Article(
                "Jewish Community Center \"Menorah\"",
                "The Menorah is a unique building that has no analogues in the world. This project reflects the past, present and future of Jewish life in Dnepropetrovsk.\n\n" +
                        "The unique architectural solution of the building, convenient location, high standards of service along with modern technical equipment form the foundation for a successful business, comfortable rest and hospitality.\n\n" +
                        "The Menorah Center is a kind of bridge for cultural exchange, the development of ties in modern society based on tolerance and mutual respect.",
                R.drawable.center_menorah
        ));
        articles.add(new Article(
                "Central City Library",
                "On August 16, 1946, the Executive Committee of the City Council of Deputies adopted a decision № 1291 \"On the organization of the city Public Library\". The initiator of the organization of the library was the chairman of the City Executive Committee Nikolai Efstafievich Gavrilenko. The library was placed in a dilapidated house No. 5 on Kharkivska street, 135 sq.m. The library staff consisted of 5 people. In 1947, 32 newspaper titles and 142 magazine titles were signed. The library was opened on May 20, 1947. At the end of 1949, the fund totaled 24,000 books.\n\n" +
                        "In 1948, it was decided to move the City Public Library to house No. 1 on Moskovskaya Street. At first it was only 500 sq.m.\n\n" +
                        "Since 1949 the Public Library has been operating in this building.\n\n" +
                        "In 1950 the library was awarded the Challenge Red Banner of the Committee for Cultural Education Institutions under the Council of Ministers of the Ukrainian USSR and the Central Committee of the Trade Union of Political Education Workers.\n\n" +
                        "During these years, a reviewing circle and a circle of artistic words began to work in the Public Library.\n\n" +
                        "In 1959 the bibliographic department of the library was reorganized into a methodical and bibliographic one. In the early 60s, open access was introduced in the city's libraries.\n\n" +
                        "In 1977, the Centralization of libraries for adults was carried out. On the basis of the city Public Library, all libraries serving the adult population at the place of residence were united.\n\n" +
                        "For 10 years, 10 rooms for libraries have been built according to special projects. By the decision of the City Executive Committee, the Central City Library was transferred to house No. 3 on Moskovskaya Street - the building of the first free public library in the city built with donations from workers for the 100th anniversary of Yekaterinoslav. The Central Bank received about 300 sq.m. additional area.\n\n" +
                        "In 1996, the Central Bank won a grant from the Vidrodzhennya Foundation in the amount of 10 thousand dollars and 10 computers were purchased.\n\n" +
                        "At the moment, the Central Bank has: a commercial rental department, a new arrivals hall, 13 computers and 3 photocopiers. Daytime attendance of the Central Bank - all year round - 500 people, on days of sessions up to 700. There is a poetry club, which has grown into a club of art and literature lovers.\n\n" +
                        "Since September 2003, the library has been operating in a new building at ul. Voskresenskaya, 23",
                R.drawable.central_city_library
        ));
        articles.add(new Article(
                "Ekaterinoslav Boulevard",
                "The pedestrian boulevard will be a continuation of the already formed Yekaterinoslavsky boulevard and will create a chain of pedestrian spaces linking D. Yavornitsky Avenue and Dolgaya Balka.\n\n" +
                        "The boulevard is longitudinally divided into three zones: along the construction line - transit routes, in the center - a polyfunctional zone (playground, area for public speeches, quiet recreation areas, etc.). In this zone, a stream is supposed to be built as a symbol of the underground river Polovitsa, which at the end of the 19th century was enclosed in a collector and now flows under the projected boulevard.\n\n" +
                        "The modular grid, paving types are taken from the already completed Yekaterinoslavsky Boulevard for maximum similarity in the perception of the existing and projected boulevards.",
                R.drawable.ekaterinoslav_boulevard
        ));
        articles.add(new Article(
                "Dnipro Drama Theater named after T. Shevchenko",
                "The theater was founded in Kiev in 1918 by the arts department of the People's Commissariat of Education. Until 1922, he remained in Kiev, and then worked in the cities of Ukraine: in 1922 - in Yekaterinoslav, 1923 - in Kharkov, in 1924 - again in Yekaterinoslav, in 1925 - in Poltava. In 1926, the theater was assigned to serve the Donbass. At the beginning it was assumed that the theater would be located in Lugansk, but in the city experiencing an acute housing crisis, no premises were found for the theater. Therefore, the city of Artemovsk became the place of permanent residence of the theater. In Lugansk, the theater performances took place from October 1 to November 28, 1926 inclusive.\n\n" +
                        "During this period, the theater troupe consisted of 46 actors. Among the famous dramatic actors were: Sidorenko, Meshcherskaya, Levitsky, Aleksandrov, from the vocal artists: Semenyuta, Polevoy, Dmitrevskaya, Petrakovskaya.\n\n" +
                        "In 1927, Dnepropetrovsk (now Dnepr) became the theater's permanent residence.\n\n" +
                        "In 1941-1943 the theater was evacuated to Aktyubinsk (Kazakhstan), in 1943-1944 - in Namangan (Uzbekistan). In the spring of 1944 the theater returned to Dnepropetrovsk.\n\n" +
                        "On December 17, 2018, by the decree of the President of Ukraine, the theater was granted national status.",
                R.drawable.shevchenko
        ));
        articles.add(new Article(
                "Dnepropetrovsk House of Organ and Chamber Music",
                "Dnipropetrovsk House of Organ and Chamber Music (Ukrainian Dnipropetrovsk Budynok of Organ and Chamber Music) is a concert hall in the city of Dnipro, the center of musical culture in the Dnipropetrovsk region, one of the existing organ halls in Ukraine. Located in the building of St. Nicholas (Bryansk) Cathedral, at 66 Sergei Nigoyan Avenue.\n\n" +
                        "The cathedral was built at the expense of the Bryansk metallurgical plant (modern. Dneprovsky plant). The author of the project was Georgy Turovets, the diocesan architect of the Poltava province.\n\n" +
                        "In 1987, a 12-ton organ from V. Sauer \". Such musicians as Harry Grodberg, Olga Basistyuk and others performed in the hall.\n\n" +
                        "21 court sessions were held on the issue of transferring the premises of the church. In 2006, representatives of the organ company visited the city. According to their conclusion, the transfer of the instrument to another place is estimated at 163 thousand euros.\n\n" +
                        "In March 2011, the building of the organ hall passed into the ownership of the Orthodox Church community, which, under the terms of an amicable agreement approved by the Economic Court of the Dnipropetrovsk region on August 26, 2010, undertakes to ensure the smooth functioning of the House of Organ and Chamber Music. According to the governor of the Dnepropetrovsk diocese, Metropolitan Irenaeus, the organ will remain intact in the upper part of the church until an organ music house is built in the city, where it can be transferred.\n\n" +
                        "Since March 14, 2013, regular services have been held in the basement of the church.",
                R.drawable.organ_and_chamber_music
        ));
        articles.add(new Article(
                "Dnipropetrovsk Philharmonic",
                "Dnipropetrovsk Regional Philharmonic named after Leonid Kogan is a state cultural institution in Dnipro. It bears the name of the famous violinist, a native of Yekaterinoslav Leonid Borisovich Kogan. The Philharmonic Hall is an architectural monument of national importance.\n\n" +
                        "The building of the public meeting on Protochnaya Street (also called Club, then Lenin) was built in 1911-1913 according to the project of the Kharkov architect Alexander Markovich Ginzburg. He is considered the founder of a new direction in the Russian architecture of the 20th century - proconstructivism. After the civil war, the building housed the club of the railway workers of the Catherine railway, at the end of the 50s it was transferred to the regional state philharmonic society, and from the early 60s to the 90s it was returned to the railway workers. The Theater of the Young Spectator was also located there.\n\n" +
                        "The first concert was a performance by the famous opera singer Ksenia Derzhinskaya. Such famous performers as Anatoly Solovyanenko, Oleg Marusev, and the Tamrazov brothers grew up within the walls of the Philharmonic. Mstislav Rostropovich, Aram Khachaturian, Svyatoslav Richter, Nikolai Petrov, David and Igor Oistrakh performed on the stage.\n\n" +
                        "The Philharmonic building has two halls - a large and a small one. At the moment, the large hall of the Philharmonic has been restored, and concerts of the symphony orchestra under the direction of the chief conductor, laureate of National and international competitions Natalia Ponomarchuk and conductor Ivan Cherednichenko are actively taking place in it. Once a month, concerts for children are held in the large hall in the \"Children's Symphony Subscription\" cycle.",
                R.drawable.dnipropetrovsk_philharmonic
        ));
    }

    public ArchitectureFragment() {

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

        //link adapter
        addArticleAdapter(rootView);
        //link lister
        addArticleListener(rootView);

        return rootView;
    }

    private void addArticleAdapter(View rootView) {
        ListView listView = rootView.findViewById(R.id.item_list_id);

        if (getActivity() != null) {
            //Create our adapter
            ArticleAdapter adapter = new ArticleAdapter(getActivity(), R.layout.short_item, articles);
            //Link listView and adapter
            listView.setAdapter(adapter);
        } else {
            Log.i("ArchitectureFragment", "getActivity return null!");
        }
    }

    private void addArticleListener(View rootView) {
        ListView listView = rootView.findViewById(R.id.item_list_id);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), ArticleActivity.class);
                intent.putExtra("Article", articles.get(position));
                Log.i("ArchitectureFragment", "Tap " + position);
                startActivity(intent);
            }
        });
    }
}
