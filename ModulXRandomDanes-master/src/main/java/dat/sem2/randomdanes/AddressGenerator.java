package dat.sem2.randomdanes;

import java.util.Random;

/**
 * The purpose of this class is to be generate random Address objects
 * @author kasper
 */
public class AddressGenerator {

    public static Address address() {
        return address(100);
    }
    
    public static Address address(int maxStreetNr) {
        Random rnd = new Random();
        String street = STREET_NAMES[rnd.nextInt(STREET_NAMES.length)];
        int nr = rnd.nextInt(maxStreetNr) + 1;
        street = street + " " + nr;
        int cityIndex = rnd.nextInt(ZIP_CITY.length / 2);
        String zip = ZIP_CITY[cityIndex*2];
        String city = ZIP_CITY[cityIndex*2 + 1];
        return new Address(street, zip, city);
    }

    private static final String[] STREET_NAMES = {
        "A.C. Meyers Vænge",
        "Alliancevej",
        "Bavnehøj Alle",
        "Beethovensvej",
        "Belvederekaj",
        "Ben Websters Vej",
        "Blushøjvej",
        "Borgbjergsvej",
        "Borgmester Christiansens Gade",
        "Bådehavnsgade",
        "Cylindervej",
        "Damagervej",
        "Dexter Gordons Vej",
        "Dieselvej",
        "Edvard Storms Vej",
        "Ellebjergvej",
        "Ellestykket",
        "Elværksvej",
        "Enghavevej",
        "Engholmen",
        "Ernie Wilkins Vej",
        "Ernst Kapers Vej",
        "Fiskerihavnsgade",
        "Flydedokken",
        "Fragtvej",
        "Frederikskaj",
        "Gamle Vasbygade",
        "Glinkasvej",
        "Glucksvej",
        "Grønrisvej",
        "Gustav Bangs Gade",
        "H.V. Rolsteds Vej",
        "Hammelstrupvej",
        "Handelsvej",
        "Hans Olriks Vej",
        "Harald Jensens Gade",
        "Havneholmen",
        "Haydnsvej",
        "Hørdumsgade",
        "Johan Kellers Vej",
        "Julius Andersens Vej",
        "K.M. Klausens Gade",
        "Kenny Drews Vej",
        "Kulvej",
        "Landvindingsgade",
        "Lone Kellermanns Vej",
        "Louis Pios Gade",
        "Molestien",
        "Mozarts Plads",
        "Mozartsvej",
        "Natalie Zahles Vej",
        "Nordre Teglkaj",
        "Offenbachsvej",
        "Oscar Pettifords Vej",
        "Otto Brandenburgs Vej",
        "Otto Busses Vej",
        "P. Knudsens Gade",
        "Parkstien",
        "Peter Holms Vej",
        "Peter Sabroes Gade",
        "Pilestykket",
        "Pladehals Allé",
        "Poppelstykket",
        "Rektorparken",
        "Richard Boones Vej",
        "Rossinisvej",
        "Rubinsteinsvej",
        "Scandiagade",
        "Schubertsvej",
        "Sejlklubvej",
        "Sigvald Olsens Gade",
        "Sjællandsbroen",
        "Sjælør Boulevard",
        "Skibbroen",
        "Sluseholmen",
        "Speditørvej",
        "Spontinisvej",
        "Stradellasvej",
        "Straussvej",
        "Stubmøllevej",
        "Støbegodsvej",
        "Støberigade",
        "Sydbanestien",
        "Sydhavns Plads",
        "Sydhavnsgade",
        "Sydløbsvej",
        "Tartinisvej",
        "Teglholm Allé",
        "Teglholm Tværvej",
        "Teglholmens Østkaj",
        "Teglholmsgade",
        "Thad Jones Vej",
        "Thomas Koppels Allé",
        "Tjæregade",
        "Topstykket",
        "Tranehavegård",
        "Tranehavevej",
        "Tudsemindevej",
        "Tømmergravsgade",
        "Unavngiven Vej 1 Uv",
        "V.A. Borgens Vej",
        "Vasbygade",
        "Ved Stigbordene",
        "Vestre Kirkegårds Allé",
        "Vestre Teglgade",
        "Vigerslev Alle",
        "Wagnersvej",
        "Wiinbladsgade",
        "Østre Teglgade",
        "A.F. Kriegers Vej",
        "A.L. Drewsens Vej",
        "Abildgaardsgade",
        "Aggersborggade",
        "Aldersrogade",
        "Amerika Plads",
        "Annekegade",
        "Arendalsgade",
        "Askøgade",
        "Assensgade",
        "Australiensvej",
        "Bechgaardsgade",
        "Bellmans Plads",
        "Bellmansgade",
        "Bergensgade",
        "Berggreensgade",
        "Biskop Krags Vænge",
        "Blegdamsvej",
        "Bogensegade",
        "Bolandsvej",
        "Bomhusvej",
        "Borgervænget",
        "Borgmester Jensens Allé",
        "Borthigsgade",
        "Brammingegade",
        "Bredelandsvej",
        "Brumleby",
        "Bryggergade",
        "Bryggervangen",
        "Bøllemosegårdsvej",
        "Børskovvej",
        "Carl Johans Gade",
        "Carl Nielsens Allé",
        "Christiansmindevej",
        "Classensgade",
        "Collinsgade",
        "Dag Hammarskjölds Allé",
        "Dampfærgevej",
        "Danstrupvej",
        "Drejøgade",
        "Eckersbergsgade",
        "Edel Sauntes Allé",
        "Edvard Griegs Gade",
        "Egebæksvej",
        "Emblasgade",
        "Emdrup Banke",
        "Emdrup Huse",
        "Emdrup Vænge",
        "Emdrupvej",
        "Engelstedsgade",
        "Engskiftevej",
        "F.F. Ulriks Gade",
        "Fakse Tværgade",
        "Faksegade",
        "Fanøgade",
        "Fiskedamsgade",
        "Folke Bernadottes Allé",
        "Forbindelsesvej",
        "Frederik V's Vej",
        "Fridtjof Nansens Plads",
        "Fruebjergvej",
        "Fåborggade",
        "Gammel Kalkbrænderi Vej",
        "Gartnerivej",
        "Gefionsgade",
        "Glænøgade",
        "Grenågade",
        "Gribskovvej",
        "Gunhildsgade",
        "Gunnar Nu Hansens Plads",
        "Gustav Adolfs Gade",
        "Gyritegade",
        "H.C. Lumbyes Gade",
        "H.P. Ørums Gade",
        "Hallinsgade",
        "Halsskovgade",
        "Hammershusgade",
        "Hans Knudsens Plads",
        "Haraldsgade",
        "Hardangergade",
        "Hedemannsgade",
        "Heisesgade",
        "Helgesensgade",
        "Helsingborggade",
        "Henrik Harpestrengs Vej",
        "Herninggade",
        "Hesseløgade",
        "Hf. Borgervænget",
        "Hildursgade",
        "Hjalmar Brantings Plads",
        "Hjelmsgade",
        "Hjortøgade",
        "Hjørringgade",
        "Hobrogade",
        "Holbækgade",
        "Holstebrogade",
        "Holsteinsgade",
        "Hornemansgade",
        "Horsensgade",
        "Horserødvej",
        "Hovgaardsgade",
        "Høyensgade",
        "Indiakaj",
        "Indiavej",
        "Irmingersgade",
        "J.A. Schwartz Gade",
        "J.E. Ohlsens Gade",
        "Jacob Erlandsens Gade",
        "Jagtvej",
        "Jellingegade",
        "Jens Juels Gade",
        "Jens Munks Gade",
        "Johan Svendsens Vej",
        "Juliane Maries Vej",
        "Kalkbrænderihavnsgade",
        "Kalkbrænderiløbskaj",
        "Kanslergade",
        "Kastellet",
        "Kastelsvej",
        "Keldsøvej",
        "Kertemindegade",
        "Kildevældsgade",
        "Kildevænget",
        "Kirsteinsgade",
        "Klosterrisvej",
        "Klostervænget",
        "Klædemålet",
        "Koldinggade",
        "Kong Oscars Gade",
        "Korsørgade",
        "Krausesvej",
        "Kristianiagade",
        "Kristineberg",
        "Kroghsgade",
        "Kuhlausgade",
        "Landskronagade",
        "Langelinie",
        "Langelinie Allé",
        "Langeliniekaj",
        "Lange-Müllers Gade",
        "Langesund",
        "Langøgade",
        "Lautrupsgade",
        "Lautrupskaj",
        "Lersø Parkallé",
        "Lersøstien",
        "Lille Farimagsgade",
        "Lilly Helveg Petersens Plads",
        "Lindenovsgade",
        "Lipkesgade",
        "Livjægergade",
        "Livøgade",
        "Lundehusvej",
        "Lundingsgade",
        "Lundsgade",
        "Lyngbyvej",
        "Løgstørgade",
        "Malmøgade",
        "Mandalsgade",
        "Manøgade",
        "Marmorvej",
        "Marskensgade",
        "Marstalsgade",
        "Marthagade",
        "Masnedøgade",
        "Melchiors Plads",
        "Middelfartgade",
        "Midtermolen",
        "Musholmgade",
        "Møllegårdsvej",
        "Mårumvej",
        "Niels W. Gades Gade",
        "Nordborggade",
        "Nordre Frihavnsgade",
        "Ny Blegdamsvej",
        "Nyborggade",
        "Nygårdsvej",
        "Næstvedgade",
        "Nøjsomhedsvej",
        "Nørre Alle",
        "Odensegade",
        "Oliemøllegade",
        "Olof Palmes Gade",
        "Olufsvej",
        "Omøgade",
        "Oslo Plads",
        "Otto Mallings Gade",
        "Ourøgade",
        "Ove Rodes Plads",
        "Pakhusvej",
        "Per Henrik Lings Allé",
        "Petersborgvej",
        "Præstøgade",
        "Ragnagade",
        "Ragnhildgade",
        "Ramløsevej",
        "Randersgade",
        "Reersøgade",
        "Ribegade",
        "Ringkøbinggade",
        "Ringstedgade",
        "Romsøgade",
        "Rosbæksvej",
        "Rosendalsgade",
        "Rosenvængets Alle",
        "Rosenvængets Hovedvej",
        "Rosenvængets Sideallé",
        "Rothesgade",
        "Rovsingsgade",
        "Rudolph Berghs Gade",
        "Ryesgade",
        "Ryparken",
        "Ryvangs Allé",
        "Rønnegade",
        "Rørsøstien",
        "Samsøgade",
        "Sankt Jakobs Gade",
        "Sankt Jakobs Plads",
        "Sankt Kjelds Gade",
        "Sankt Kjelds Plads",
        "Scherfigsvej",
        "Sejrøgade",
        "Serridslevvej",
        "Sifs Plads",
        "Silkeborg Plads",
        "Silkeborggade",
        "Sionsgade",
        "Skanderborggade",
        "Skarøgade",
        "Skovgaardsgade",
        "Slagelsegade",
        "Soldalen",
        "Solvænget",
        "Sortedam Dossering",
        "Sorøgade",
        "Spangbergsgade",
        "Stadens Vænge",
        "Stakkesund",
        "Stavangergade",
        "Steen Billes Gade",
        "Stockholmsgade",
        "Strandboulevarden",
        "Strandpromenaden",
        "Strandvejen",
        "Strandvænget",
        "Strandøre",
        "Strynøgade",
        "Strødamvej",
        "Stubbeløbgade",
        "Studsgaardsgade",
        "Sundkrogen",
        "Sundkrogsgade",
        "Sundkrogskaj",
        "Svaneknoppen",
        "Svanemøllens Kaserne",
        "Svanemøllevej",
        "Svanevænget",
        "Svendborggade",
        "Sæbygade",
        "Sølundsvej",
        "Sønderborggade",
        "Søpassagen",
        "Saabyesvej",
        "Teglstrupvej",
        "Teglværksgade",
        "Thomas Laubs Gade",
        "Trepkasgade",
        "Trianglen",
        "Trondhjems Plads",
        "Trondhjemsgade",
        "Tåsingegade",
        "Universitetsparken",
        "Upsalagade",
        "Urbansgade",
        "Valdemar Holmers Gade",
        "Vangehusvej",
        "Vardegade",
        "Ved Hegnet",
        "Ved Kildevældskirken",
        "Ved Klosteret",
        "Ved Sporsløjfen",
        "Ved Vænget",
        "Vejlegade",
        "Vejrøgade",
        "Vennemindevej",
        "Venøgade",
        "Vermundsgade",
        "Vestagervej",
        "Vesterled",
        "Vibekegade",
        "Viborggade",
        "Victor Bendix Gade",
        "Victor Borges Plads",
        "Visbygade",
        "Vognmandsmarken",
        "Voldmestergade",
        "Vordingborggade",
        "Webersgade",
        "Weysesgade",
        "Wiedeweltsgade",
        "Wilhelm Marstrands Gade",
        "Willemoesgade",
        "Zinnsgade",
        "Æbeløgade",
        "Østbanegade",
        "Øster Alle",
        "Øster Farimagsgade",
        "Øster Søgade",
        "Østerbrogade",
        "Østerfælled Torv",
        "Østerled",
        "Ålborggade",
        "Århus Plads",
        "Århusgade"};

    private static final String[] ZIP_CITY = {
        "5320", " Agedrup",
        "6753", " Agerbæk",
        "6534", " Agerskov",
        "2620", " Albertslund",
        "3450", " Allerød",
        "8961", " Allingåbro",
        "3770", " Allinge",
        "6051", " Almind",
        "8592", " Anholt",
        "8643", " Ans By",
        "6823", " Ansager",
        "9510", " Arden",
        "4792", " Askeby",
        "4550", " Asnæs",
        "5466", " Asperup",
        "5610", " Assens",
        "9340", " Asaa",
        "6440", " Augustenborg",
        "7490", " Aulum",
        "8963", " Auning",
        "5935", " Bagenkop",
        "2880", " Bagsværd",
        "8444", " Balle",
        "2750", " Ballerup",
        "4941", " Bandholm",
        "7150", " Barrit",
        "8330", " Beder",
        "7755", " Bedsted Thy",
        "6541", " Bevtoft",
        "6852", " Billum",
        "7190", " Billund",
        "9881", " Bindslev",
        "3460", " Birkerød",
        "8850", " Bjerringbro",
        "6091", " Bjert",
        "4632", " Bjæverskov",
        "9492", " Blokhus",
        "5491", " Blommenslyst",
        "6857", " Blåvand",
        "4242", " Boeslunde",
        "5400", " Bogense",
        "4793", " Bogø By",
        "6392", " Bolderslev",
        "7441", " Bording",
        "4791", " Borre",
        "4140", " Borup",
        "8220", " Brabrand",
        "6740", " Bramming",
        "7330", " Brande",
        "6535", " Branderup Jylland",
        "6261", " Bredebro",
        "7182", " Bredsten",
        "5464", " Brenderup Fyn",
        "6310", " Broager",
        "5672", " Broby",
        "9460", " Brovst",
        "8654", " Bryrup",
        "8740", " Brædstrup",
        "2605", " Brøndby",
        "2660", " Brøndby Strand",
        "9700", " Brønderslev",
        "2700", " Brønshøj",
        "6650", " Brørup",
        "6372", " Bylderup-Bov",
        "6622", " Bække",
        "7660", " Bækmarksbro",
        "9574", " Bælum",
        "7080", " Børkop",
        "7650", " Bøvlingbjerg",
        "2920", " Charlottenlund",
        "6070", " Christiansfeld",
        "5380", " Dalby",
        "4261", " Dalmose",
        "4983", " Dannemare",
        "8721", " Daugård",
        "4293", " Dianalund",
        "2791", " Dragør",
        "9330", " Dronninglund",
        "3120", " Dronningmølle",
        "9352", " Dybvad",
        "2870", " Dyssegård",
        "5631", " Ebberup",
        "8400", " Ebeltoft",
        "6320", " Egernsund",
        "6040", " Egtved",
        "8250", " Egå",
        "5592", " Ejby",
        "7361", " Ejstrupholm",
        "7442", " Engesvang",
        "4895", " Errindlev",
        "7950", " Erslev",
        "6700", " Esbjerg",
        "6715", " Esbjerg N",
        "6710", " Esbjerg V",
        "6705", " Esbjerg Ø",
        "4593", " Eskebjerg",
        "4863", " Eskilstrup",
        "3060", " Espergærde",
        "4640", " Fakse",
        "4654", " Fakse Ladeplads",
        "6720", " Fanø",
        "9640", " Farsø",
        "3520", " Farum",
        "4944", " Fejø",
        "5863", " Ferritslev Fyn",
        "4173", " Fjenneslev",
        "9690", " Fjerritslev",
        "8762", " Flemming",
        "3480", " Fredensborg",
        "7000", " Fredericia",
        "2000", " Frederiksberg",
        "9900", " Frederikshavn",
        "3600", " Frederikssund",
        "3300", " Frederiksværk",
        "5871", " Frørup",
        "7741", " Frøstrup",
        "4250", " Fuglebjerg",
        "7884", " Fur",
        "4591", " Føllenslev",
        "6683", " Føvling",
        "5600", " Faaborg",
        "4540", " Fårevejle",
        "8990", " Fårup",
        "8882", " Fårvang",
        "7321", " Gadbjerg",
        "4621", " Gadstrup",
        "8464", " Galten",
        "9362", " Gandrup",
        "4874", " Gedser",
        "9631", " Gedsted",
        "8751", " Gedved",
        "5591", " Gelsted",
        "2820", " Gentofte",
        "6621", " Gesten",
        "3250", " Gilleleje",
        "5854", " Gislev",
        "4532", " Gislinge",
        "9260", " Gistrup",
        "7323", " Give",
        "8983", " Gjerlev Jylland",
        "8883", " Gjern",
        "5620", " Glamsbjerg",
        "6752", " Glejbjerg",
        "8585", " Glesborg",
        "2600", " Glostrup",
        "4171", " Glumsø",
        "6510", " Gram",
        "6771", " Gredstedbro",
        "8500", " Grenaa",
        "2670", " Greve",
        "4571", " Grevinge",
        "7200", " Grindsted",
        "3230", " Græsted",
        "6300", " Gråsten",
        "5892", " Gudbjerg Sydfyn",
        "3760", " Gudhjem",
        "5884", " Gudme",
        "4862", " Guldborg",
        "6690", " Gørding",
        "4281", " Gørlev",
        "3330", " Gørløse",
        "6100", " Haderslev",
        "7540", " Haderup",
        "8370", " Hadsten",
        "9560", " Hadsund",
        "9370", " Hals",
        "8450", " Hammel",
        "7362", " Hampen",
        "7730", " Hanstholm",
        "7673", " Harboøre",
        "8462", " Harlev Jylland",
        "5463", " Harndrup",
        "4912", " Harpelunde",
        "3790", " Hasle",
        "4690", " Haslev",
        "8361", " Hasselager",
        "4622", " Havdrup",
        "8970", " Havndal",
        "2640", " Hedehusene",
        "8722", " Hedensted",
        "6094", " Hejls",
        "7250", " Hejnsvig",
        "3150", " Hellebæk",
        "2900", " Hellerup",
        "3200", " Helsinge",
        "3000", " Helsingør",
        "6893", " Hemmet",
        "6854", " Henne",
        "4681", " Herfølge",
        "2730", " Herlev",
        "4160", " Herlufmagle",
        "7400", " Herning",
        "5874", " Hesselager",
        "3400", " Hillerød",
        "8382", " Hinnerup",
        "9850", " Hirtshals",
        "9320", " Hjallerup",
        "7560", " Hjerm",
        "8530", " Hjortshøj",
        "9800", " Hjørring",
        "9500", " Hobro",
        "4300", " Holbæk",
        "4960", " Holeby",
        "4684", " Holmegaard",
        "7500", " Holstebro",
        "6670", " Holsted",
        "2840", " Holte",
        "4871", " Horbelev",
        "3100", " Hornbæk",
        "8543", " Hornslet",
        "8783", " Hornsyld",
        "8700", " Horsens",
        "4913", " Horslunde",
        "6682", " Hovborg",
        "8732", " Hovedgård",
        "5932", " Humble",
        "3050", " Humlebæk",
        "3390", " Hundested",
        "8350", " Hundslund",
        "7760", " Hurup Thy",
        "4330", " Hvalsø",
        "6960", " Hvide Sande",
        "2650", " Hvidovre",
        "8270", " Højbjerg",
        "4573", " Højby",
        "6280", " Højer",
        "7840", " Højslev",
        "4270", " Høng",
        "8362", " Hørning",
        "2970", " Hørsholm",
        "4534", " Hørve",
        "5683", " Haarby",
        "4652", " Hårlev",
        "4872", " Idestrup",
        "7430", " Ikast",
        "2635", " Ishøj",
        "6851", " Janderup Vestjylland",
        "7300", " Jelling",
        "9740", " Jerslev Jylland",
        "4490", " Jerslev Sjælland",
        "9981", " Jerup",
        "6064", " Jordrup",
        "7130", " Juelsminde",
        "4450", " Jyderup",
        "4040", " Jyllinge",
        "4174", " Jystrup Midtsjælland",
        "3630", " Jægerspris",
        "4400", " Kalundborg",
        "4771", " Kalvehave",
        "7960", " Karby",
        "4653", " Karise",
        "2690", " Karlslunde",
        "4736", " Karrebæksminde",
        "7470", " Karup Jylland",
        "2770", " Kastrup",
        "5300", " Kerteminde",
        "4892", " Kettinge",
        "6933", " Kibæk",
        "4360", " Kirke Eskilstrup",
        "4070", " Kirke Hyllinge",
        "4060", " Kirke Såby",
        "8620", " Kjellerup",
        "2930", " Klampenborg",
        "9270", " Klarup",
        "3782", " Klemensker",
        "4672", " Klippinge",
        "8765", " Klovborg",
        "8420", " Knebel",
        "2980", " Kokkedal",
        "6000", " Kolding",
        "8560", " Kolind",
        "2800", " Kongens Lyngby",
        "9293", " Kongerslev",
        "4220", " Korsør",
        "6340", " Kruså",
        "3490", " Kvistgård",
        "5772", " Kværndrup",
        "2200", " København N",
        "2400", " København NV",
        "2300", " København S",
        "2450", " København SV",
        "2100", " København Ø",
        "4600", " Køge",
        "4772", " Langebæk",
        "5550", " Langeskov",
        "8870", " Langå",
        "4320", " Lejre",
        "6940", " Lem St.",
        "8632", " Lemming",
        "7620", " Lemvig",
        "4623", " Lille Skensved",
        "6660", " Lintrup",
        "3360", " Liseleje",
        "4750", " Lundby",
        "6640", " Lunderskov",
        "3540", " Lynge",
        "8520", " Lystrup",
        "9940", " Læsø",
        "8831", " Løgstrup",
        "9670", " Løgstør",
        "6240", " Løgumkloster",
        "9480", " Løkken",
        "8723", " Løsning",
        "8670", " Låsby",
        "8340", " Malling",
        "9550", " Mariager",
        "4930", " Maribo",
        "5290", " Marslev",
        "5960", " Marstal",
        "5390", " Martofte",
        "3370", " Melby",
        "4735", " Mern",
        "5370", " Mesinge",
        "5500", " Middelfart",
        "5642", " Millinge",
        "5462", " Morud",
        "4190", " Munke Bjergby",
        "5330", " Munkebo",
        "9632", " Møldrup",
        "8544", " Mørke",
        "4440", " Mørkøv",
        "2760", " Måløv",
        "8320", " Mårslet",
        "4900", " Nakskov",
        "3730", " Nexø",
        "9240", " Nibe",
        "8581", " Nimtofte",
        "2990", " Nivå",
        "6430", " Nordborg",
        "5800", " Nyborg",
        "4800", " Nykøbing Falster",
        "7900", " Nykøbing Mors",
        "4500", " Nykøbing Sjælland",
        "4296", " Nyrup",
        "4880", " Nysted",
        "2850", " Nærum",
        "4700", " Næstved",
        "9610", " Nørager",
        "4840", " Nørre Alslev",
        "4572", " Nørre Asmindrup",
        "6830", " Nørre Nebel",
        "8766", " Nørre Snede",
        "5580", " Nørre Aaby",
        "4951", " Nørreballe",
        "9400", " Nørresundby",
        "8300", " Odder",
        "5000", " Odense C",
        "5230", " Odense M",
        "5270", " Odense N",
        "5210", " Odense NV",
        "5240", " Odense NØ",
        "5260", " Odense S",
        "5250", " Odense SV",
        "5220", " Odense SØ",
        "5200", " Odense V",
        "6840", " Oksbøl",
        "5450", " Otterup",
        "5883", " Oure",
        "6855", " Ovtrup",
        "6330", " Padborg",
        "9490", " Pandrup",
        "4720", " Præstø",
        "7183", " Randbøl",
        "8900", " Randers",
        "9681", " Ranum",
        "8763", " Rask Mølle",
        "7970", " Redsted Mors",
        "4420", " Regstrup",
        "6760", " Ribe",
        "5750", " Ringe",
        "6950", " Ringkøbing",
        "4100", " Ringsted",
        "8240", " Risskov",
        "4000", " Roskilde",
        "7870", " Roslev",
        "4243", " Rude",
        "5900", " Rudkøbing",
        "4291", " Ruds Vedby",
        "2960", " Rungsted Kyst",
        "8680", " Ry",
        "5350", " Rynkeby",
        "8550", " Ryomgård",
        "5856", " Ryslinge",
        "4970", " Rødby",
        "6630", " Rødding",
        "6230", " Rødekro",
        "8840", " Rødkærsbro",
        "2610", " Rødovre",
        "4673", " Rødvig Stevns",
        "6792", " Rømø",
        "8410", " Rønde",
        "3700", " Rønne",
        "4683", " Rønnede",
        "4581", " Rørvig",
        "8471", " Sabro",
        "4990", " Sakskøbing",
        "9493", " Saltum",
        "8305", " Samsø",
        "4262", " Sandved",
        "4592", " Sejerø",
        "8600", " Silkeborg",
        "9870", " Sindal",
        "4583", " Sjællands Odde",
        "6093", " Sjølund",
        "9990", " Skagen",
        "8832", " Skals",
        "5485", " Skamby",
        "8660", " Skanderborg",
        "4050", " Skibby",
        "7800", " Skive",
        "6900", " Skjern",
        "2942", " Skodsborg",
        "2740", " Skovlunde",
        "4230", " Skælskør",
        "6780", " Skærbæk",
        "3320", " Skævinge",
        "8541", " Skødstrup",
        "9520", " Skørping",
        "5881", " Skårup Fyn",
        "4200", " Slagelse",
        "3550", " Slangerup",
        "2765", " Smørum",
        "7752", " Snedsted",
        "3070", " Snekkersten",
        "4460", " Snertinge",
        "8355", " Solbjerg",
        "2680", " Solrød Strand",
        "6560", " Sommersted",
        "8641", " Sorring",
        "4180", " Sorø",
        "8981", " Spentrup",
        "6971", " Spjald",
        "8472", " Sporup",
        "7860", " Spøttrup",
        "7270", " Stakroge",
        "4780", " Stege",
        "8781", " Stenderup",
        "4295", " Stenlille",
        "3660", " Stenløse",
        "5771", " Stenstrup",
        "4773", " Stensved",
        "7850", " Stoholm Jylland",
        "4952", " Stokkemarke",
        "4480", " Store Fuglede",
        "4660", " Store Heddinge",
        "4370", " Store Merløse",
        "9280", " Storvorde",
        "7140", " Stouby",
        "9970", " Strandby",
        "7600", " Struer",
        "4671", " Strøby",
        "4850", " Stubbekøbing",
        "9530", " Støvring",
        "9541", " Suldrup",
        "9381", " Sulsted",
        "7451", " Sunds",
        "3740", " Svaneke",
        "4470", " Svebølle",
        "5700", " Svendborg",
        "9230", " Svenstrup Jylland",
        "4520", " Svinninge",
        "6470", " Sydals",
        "9300", " Sæby",
        "2860", " Søborg",
        "5985", " Søby Ærø",
        "4920", " Søllested",
        "7280", " Sønder Felding",
        "7260", " Sønder Omme",
        "6092", " Sønder Stenderup",
        "6400", " Sønderborg",
        "5471", " Søndersø",
        "7550", " Sørvad",
        "4733", " Tappernøje",
        "6880", " Tarm",
        "9575", " Terndrup",
        "8653", " Them",
        "7700", " Thisted",
        "8881", " Thorsø",
        "7680", " Thyborøn",
        "7790", " Thyholm",
        "3080", " Tikøb",
        "8381", " Tilst",
        "6980", " Tim",
        "6360", " Tinglev",
        "6862", " Tistrup",
        "3220", " Tisvildeleje",
        "8830", " Tjele",
        "6731", " Tjæreborg",
        "6520", " Toftlund",
        "5690", " Tommerup",
        "4891", " Toreby Lolland",
        "4943", " Torrig Lolland",
        "8310", " Tranbjerg Jylland",
        "5953", " Tranekær",
        "8380", " Trige",
        "8570", " Trustrup",
        "4682", " Tureby",
        "9382", " Tylstrup",
        "4340", " Tølløse",
        "6270", " Tønder",
        "7160", " Tørring",
        "9830", " Tårs",
        "2630", " Taastrup",
        "4350", " Ugerløse",
        "7171", " Uldum",
        "6990", " Ulfborg",
        "5540", " Ullerslev",
        "8860", " Ulstrup",
        "9430", " Vadum",
        "2500", " Valby",
        "2625", " Vallensbæk",
        "2665", " Vallensbæk Strand",
        "6580", " Vamdrup",
        "7184", " Vandel",
        "2720", " Vanløse",
        "6800", " Varde",
        "2950", " Vedbæk",
        "5474", " Veflinge",
        "3210", " Vejby",
        "6600", " Vejen",
        "6853", " Vejers Strand",
        "7100", " Vejle",
        "7120", " Vejle Øst",
        "5882", " Vejstrup",
        "3670", " Veksø Sjælland",
        "7570", " Vemb",
        "4241", " Vemmelev",
        "7742", " Vesløs",
        "9380", " Vestbjerg",
        "5762", " Vester Skerninge",
        "4953", " Vesterborg",
        "7770", " Vestervig",
        "8800", " Viborg",
        "8260", " Viby Jylland",
        "4130", " Viby Sjælland",
        "6920", " Videbæk",
        "4560", " Vig",
        "7480", " Vildbjerg",
        "7980", " Vils",
        "7830", " Vinderup",
        "4390", " Vipperød",
        "2830", " Virum",
        "5492", " Vissenbjerg",
        "6052", " Viuf",
        "9310", " Vodskov",
        "6500", " Vojens",
        "7173", " Vonge",
        "6623", " Vorbasse",
        "4760", " Vordingborg",
        "9760", " Vrå",
        "4873", " Væggerløse",
        "3500", " Værløse",
        "5970", " Ærøskøbing",
        "6870", " Ølgod",
        "3310", " Ølsted",
        "3650", " Ølstykke",
        "5853", " Ørbæk",
        "6973", " Ørnhøj",
        "8950", " Ørsted",
        "8586", " Ørum Djurs",
        "8752", " Østbirk",
        "7990", " Øster Assels",
        "4894", " Øster Ulslev",
        "9750", " Øster Vrå",
        "3751", " Østermarie",
        "6200", " Aabenraa",
        "9440", " Aabybro",
        "8230", " Åbyhøj",
        "3720", " Aakirkeby",
        "9000", " Aalborg",
        "9200", " Aalborg SV",
        "9210", " Aalborg SØ",
        "9220", " Aalborg Øst",
        "9982", " Ålbæk",
        "9620", " Aalestrup",
        "3140", " Ålsgårde",
        "8000", " Århus C",
        "8200", " Århus N",
        "8210", " Århus V",
        "6818", " Årre",
        "9600", " Aars",
        "5792", " Årslev",
        "5560", " Aarup"};
}
