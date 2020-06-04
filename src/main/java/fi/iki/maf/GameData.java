package fi.iki.maf;

import java.util.ArrayList;

public class GameData {

	static final public int FirstRound = 1;
	static final public int LastRound = 12;

	/* Introduction text for each game round */
	public static String getIntroduction(int round) {
		switch (round) {
			case 1: return "Huomenta! Herätyskello soi! Kello on 8:15. Olet 10-vuotias neljäsluokkalainen koululainen.\n"
				+ "Korona-epidemian takia koulut on suljettu ja koulua käydään etäopetuksena.\n"
				+ "Koulu alkaa kello 9 ja tiedät että opettaja tulee silloin lähettämään sinulle\n"
				+ "koulupäivän ohjelman Wilma-viestinä. Miten toimit?";
			case 2: return "Kello on 8:30. Vielä on aikaa koulun alkuun.";
			case 3: return "Kello on 8:45. Vielä ehdit jotain ennen koulun alkua.";
			case 4: return "Kello on 9:00. Olet saanut puhelimeesi Wilma-viestin opettajalta. Siinä lukee seuraavaa:\n"
				+ "Päivän lukujärjestys:\n"
				+ " - Kirjoita tänään vähintään 15min päiväkirjavihkoon\n"
				+ " - Lue tänään 30min kirjaa.\n"
				+ " - Harjoittele ympäristöopin kokeeseen.\n"
				+ " - 9.30-10.30 Etäopetustunti (pakollinen kaikille)\n"
				+ " - 11-12 Lounas ja tauko\n"
				+ " - 12:00-13:00 Äidinkieli: Sanaluokkien kertaus jatkuu. Oppikirjan kappale 45-46 s. 121-123.\n"
				+ "     Kertaa pronominit ja numeraalit. Tee Villestä kierrokset: Numeraalit ja Pronominit pronssille.\n"
				+ " - 12:00-13:00 Yhteiskuntaoppi: Lue ensin s.56-59. Vastaan sitten yhteiskuntaopin kurssisivulla oleviin kysymyksiin.";
			case 5: return "Kello on 9:30. Mitä teet?";
			case 6: return "Kello on 10:30. Mitäs sitten?";
			case 7: return "Kello on 11:00. Vähän tuntuisi olevan nälkä.";
			case 8: return "Kello on 12:00. Mitähän seuraavaksi?";
			case 9: return "Kello on 13:00. Iltapäivä jo.";
			case 10: return "Kello on 14:00. Mitäs nyt?";
			case 11: return "Kello on 15:00. Kaverisi soittaa ja pyytää pelaamaan Minecraftia.";
			case 12: return "Kello on 16:00. Vanhempasi lopettaa pian etätyöpäivän. Vielä ehdit jotain.";
		}
		return "";
	}

	/* Available options for game rounds */
	public static ArrayList<Option> getOptions() {
		ArrayList<Option> options = new ArrayList<>();
		// 0
		options.add(new Option(
			1, 3,
			"Riisu yöasu ja pue päivävaatteet päällesi.",
			"Puit päivävaatteet päällesi.",
			"Unohdit pukea päivävaatteesi. Olit koulumeetissä yöasussa ja koulukaverisi vitsailevat asiasta. Koulupäivän jälkeen vanhempasi huomasivat asian ja sinua nolotti.",
			"Muistit pukea päivävaatteesi.",
			-10, +10, null
		));
		// 1
		options.add(new Option(
			1, 3,
			"Mene keittiöön syömään aamiaista.",
			"Söit maittavan aamiaisen.",
			"Unohdit syödä aamiaista ja aamupäivällä sinulla oli kova nälkä ja kiukkuinen olo.",
			"Muistit syödä aamiaisen.",
			-10, +10, null
		));
		// 2
		options.add(new Option(
			2, 3,
			"Mene pesemään hampaasi.",
			"Pesit hampaasi.",
			"Unohdit pestä hampaasi. Suussasi oli kummallinen maku koko päivän. Jos unohdat pestä monena päivänä hampaasi, voi sinulle tulla reikiä hampaisiin.",
			"Muistit pestä hampaasi.",
			-10, +10, options.get(1)
		));
		// 3
		options.add(new Option(
			1, 3,
			"Pelaa Geometry Dashiä.",
			"Vartti vierähti nopeasti Geometry Dashin parissa. Vähän kun pelaisi lisää pääsisi levelin läpi.",
			null,
			null,
			0, 0, null
		));
		// 4
		options.add(new Option(
			2, 3,
			"Pelaa Geometry Dashiä.",
			"Vartti vierähti taas nopeasti Geometry Dashin parissa. Jos pääsisi vielä haastavammasta tasosta läpi niin saisi hienon merkinnän profiiliin.",
			null,
			null,
			0, 0, options.get(3)
		));
		// 5
		options.add(new Option(
			3, LastRound,
			"Pelaa Geometry Dashiä.",
			"Aika vierähti nopeasti Geometry Dashin parissa, mutta et ihan päässyt tasosta läpi. Peli kyllästyttää jo.",
			null,
			null,
			0, 0, options.get(4)
		));
		// 6
		options.add(new Option(
			1, 3,
			"Tarkista onko mielitubettajasi julkaissut mitään uutta Youtubessa.",
			"Vartti vierähti Youtuben parissa. Youtube ehdottaa uutta vielä mielenkiintoisempaa videota.",
			null,
			null,
			0, 0, null
		));
		// 7
		options.add(new Option(
			1, 3,
			"Katso ehdotettu uusi Youtube video.",
			"Vartti vierähti nopeasti Youtuben parissa. Youtube ehdottaa uutta vielä mielenkiintoisempaa videota.",
			null,
			null,
			0, 0, options.get(6)
		));
		// 8
		options.add(new Option(
			1, 3,
			"Katso ehdotettu uusi Youtube video.",
			"Vartti vierähti taas nopeasti Youtuben parissa. Youtube ehdottaa uutta vielä mielenkiintoisempaa videota.",
			null,
			null,
			0, 0, options.get(7)
		));
		// 9
		options.add(new Option(
			4, LastRound,
			"Katso Youtubea.",
			"Aika vierähti mukavasti Youtubea katsoessa. Youtube ehdottaa uutta jännempää videota.",
			null,
			null,
			0, 0, null
		));
		// 10
		options.add(new Option(
			4, LastRound,
			"Katso jännittävä Youtube-video.",
			"Youtube video oli pelottava. Toivottavasti yöunet ei mene. Youtube ehdottaa uutta hauskempaa videota.",
			null,
			null,
			0, 0, options.get(9)
		));
		// 11
		options.add(new Option(
			4, LastRound,
			"Katso hauska Youtube-video.",
			"Katsoit useamman Youtube-videon. Tämä on tosi kivaa. Youtube ehdottaa uutta vielä hauskempaa videota.",
			null,
			null,
			0, 0, options.get(10)
		));
		// 12
		options.add(new Option(
			4, LastRound,
			"Katso hauska Youtube-video.",
			"Aika kuluu mukavasti Youtuben parissa. Youtube ehdottaa yhä videoita.",
			null,
			null,
			0, 0, options.get(11)
		));
		// 13
		options.add(new Option(
			4, LastRound,
			"Katso lisää Youtubea.",
			"Aika kuluu Youtuben parissa. Youtube ehdottaa yhä videoita.",
			null,
			null,
			0, 0, options.get(12)
		));
		// 14
		options.add(new Option(
			4, LastRound,
			"Katso lisää Youtubea.",
			"Aika kuluu Youtuben parissa. Youtube alkaa jo kyllästyttää. Pitäisiköhän tehdä jotain muuta?",
			null,
			null,
			0, 0, options.get(13)
		));
		// 15
		options.add(new Option(
			4, LastRound,
			"Katso lisää Youtubea.",
			"Aika kuluu Youtuben parissa. Tulee jo nuutunut olo ja kyllästyttää. Pitiköhän tehdä tänään jotain muuta?",
			null,
			"Katsoit paljon Youtubea ja olo on ihan nuutunut.",
			0, -10, options.get(14)
		));
		// 16
		options.add(new Option(
			4, LastRound,
			"Katso lisää Youtubea.",
			"Aika kuluu Youtuben parissa. Youtube ehdottaa vieläkin uusia videoita.",
			null,
			null,
			0, 0, options.get(15)
		));
		// 17
		options.add(new Option(
			4, LastRound,
			"Katso lisää Youtubea.",
			"Aika kului Youtuben parissa. Nyt ei jaksa enää yhtään videota.",
			null,
			null,
			0, 0, options.get(16)
		));
		// 18
		options.add(new Option(
			4, LastRound,
			"Katso lisää Youtubea.",
			"Alkaa jo kaduttaa, kun kaikki aika on kulunut videoita katsellessa.",
			null,
			null,
			0, 0, options.get(17)
		));
		// 19
		options.add(new Option(
			4, LastRound,
			"Katso lisää Youtubea.",
			"Puhelimesta loppui akku videoita katsellessa.",
			null,
			"Puhelimesta loppui akku.",
			0, -10, options.get(18)
		));
		// 20
		options.add(new Option(
			4, LastRound,
			"Lue kirjaa.",
			"Luit kirjan loppuun ja merkitsit sen lukudiplomiin. Taas yksi kirja vähemmän jäljellä.",
			"Et saanut lukudiplomiin kirjamerkintää. Joudut lukemaan myöhemmin vielä enemmän.",
			"Sait lukudiplomiin yhden kirjan luettua.",
			-10, +10, null
		));
		// 21
		options.add(new Option(
			4, LastRound,
			"Kirjoita tästä päivästä päiväkirjavihkoon.",
			"Kirjoitit tästä päivästä uutisia päiväkirjavihkoon.",
			null,
			"Sait hyvää kirjoittamisharjoitusta kirjoittamalla päiväkirjaa.",
			0, +10, null
		));
		// 22
		options.add(new Option(
			5, 5,
			"Liity etäopetustunnin meettiin.",
			"Osallistuit opettajan ohjaamalle etäopetustunnille. Teitte yhdessä matematiikan tehtäviä.",
			"Sait poissaolomerkinnän Wilmaan. Vanhempasi ovat tosi pettyneitä pinnaamiseesi. Lisäksi jäit jälkeen matematiikan tehtävistä.",
			"Osallistuit etäopetustunnille ja opit ratkomaan matematiikan tehtäviä.",
			-30, +10, null
		));
		// 23
		options.add(new Option(
			7, 8,
			"Syö lounasta.",
			"Söit lounasta lounasaikaan ja pidit vähän taukoa.",
			"Missasit lounaan lounasaikaan ja iltapäivällä sinulla oli kova nälkä ja kiukkuinen olo.",
			"Muistit syödä lounaan.",
			-10, +10, null
		));
		// 24
		options.add(new Option(
			11, 11,
			"Pelaa Minea kaverin kanssa.",
			"Pelasit Minecraftia kaverin kanssa. Olipa mukava peli. Kaveri ehdottaa että jatketaan pelaamista.",
			"Kaveri pettyi kun ei päässyt pelaamaan kanssasi.",
			"Pelasit Minecraftia kaverin kanssa.",
			-5, 0, null
		));
		// 25
		options.add(new Option(
			12, 12,
			"Jatka Minen pelaamista.",
			"Pelasit lisää Minecraftia kaverin kanssa. Teillä oli tosi mukavat pelit.",
			null,
			null,
			0, 0, options.get(24)
		));
		// 26
		options.add(new Option(
			9, LastRound,
			"Lue uusi Aku Ankka.",
			"Luit uuden Aku Ankan. Se oli oikeastaan aika kiva lehti.",
			null,
			"Luit uuden Aku Ankan.",
			0, 0, null
		));
		// 27
		options.add(new Option(
			4, LastRound,
			"Kertaa pronominit ja numeraalit, ja tee Ville-tehtävät pronssille.",
			"Kertasit pronominit ja numeraalit, ja teit Ville-tehtävät pronssille.",
			"Sait Wilma-merkinnän unohtuneista äidinkielentehtävistä. Vanhempasi ihmettelevät unohtuneita kotitehtäviäsi.",
			"Teit pakolliset äidinkielen tehtävät.",
			-20, +10, null
		));
		// 28
		options.add(new Option(
			5, LastRound,
			"Tee äidinkielen Ville-tehtävät timantille.",
			"Teit äidinkielen Ville-tehtävät timantille. Sinusta tuntuu tosi hyvältä ja tunnet osaavasi pronominit ja numeraalit tosi hyvin.",
			null,
			"Teit äidinkielentehtävät timantille. Sen ansiosta pärjäsit tosi hyvin äidinkielen kokeessa.",
			0, +10, options.get(27)
		));
		// 29
		options.add(new Option(
			4, LastRound,
			"Lue yhteiskuntaopin sivut ja vastaa kurssisivun tehtäviin.",
			"Teit yhteiskuntaopin tehtävät.",
			"Sait Wilma-merkinnän unohtuneista yhteiskuntaopin tehtävistä. Vanhempasi ihmettelevät unohtuneita kotitehtäviäsi.",
			"Teit yhteiskuntaopin tehtävät.",
			-20, +10, null
		));
		// 30
		options.add(new Option(
			4, LastRound,
			"Lue toista kirjaa.",
			"Aloitit uuden kirjan ja luit sitä jo hyvän matkaa.",
			null,
			"Sait luettua toista kirjaa lukudiplomia varten. Lukudiplomisi valmistuu tuota pikaa.",
			0, +5, options.get(20)
		));
		// 31
		options.add(new Option(
			6, LastRound,
			"Lähde kävelylle.",
			"Kävit tekemässä pienen kävelylenkin ja piristyit.",
			"Unohdin ulkoilla. Toivottavasti liikut illalla.",
			"Teit piristävän kävelylenkin ja pidit huolta kunnostasi.",
			0, +10, null
		));
		// 32
		options.add(new Option(
			9, 11,
			"Syö välipalaa.",
			"Söit välipalaa ja pidit taukoa.",
			"Missasit välipalan ja sinulle tuli kova nälkä ja kiukkuinen olo iltapäivällä.",
			"Muistit syödä välipalan.",
			-10, +10, null
		));
		// 33
		options.add(new Option(
			4, LastRound,
			"Harjoittele ympäristöopin kokeeseen.",
			"Harjoittelit ympäristöopin kokeeseen. Sinusta tuntuu että hallitset koealueen.",
			"Ympäristöopin koe meni ihan penkin alle. Siinä kysyttiin tosi vaikeita kysymyksiä. Olisikohan lukeminen auttanut.",
			"Ympäristöopin kokeesta tuli huippuarvosana. Koe tuntui tosi helpolta.",
			-10, +10, null
		));
		return options;
	}

	/* Resulting score evaluation */
	public static String getResult(int score) {
		if (score >= 110) return "Loistosuoritus!";
		if (score >= 100) return "Hyvä koulupäivä!";
		if (score >= 90) return "Ihan hyvin meni.";
		if (score >= 75) return "Jotenkuten selvisit, mutta koulutyö ei etene.";
		if (score >= 50) return "Aika laiska päivä. Todistusnumerot kärsii.";
		if (score >= 25) return "Surkeaa. Koulupäivä sujui huonosti.";
		if (score >= 0) return "Nyt meni päivä ihan mönkään. Koulupäivä ei sujunut ollenkaan.";
		return "Aivan kamalaa. Tällä menolla ei hyvää seuraa.";
	}
}
