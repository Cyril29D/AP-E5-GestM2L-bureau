

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


INSERT INTO `clients` (`codeCli`, `raisonSociale`, `adresse`, `telfixe`, `telmobile`, `correspondant`) VALUES
('123Y4Z0E8', 'SARL les Boutilles', '7, avenue les Alizés', '0177887766', '', 'Mme Champ\r\n'),
('3TR6D9SK', 'ASL les Bas de Lavita', 'Lotissement les Agandas\r\n', '0456783526', '', 'M Jotupala\r\n'),
('D437AER9U', 'Club l\'âge d\'or', '23 rue des anguilles\r\n', '0124352618', '', 'M Torti\r\n'),
('HQME72TE', 'entreprise \"Goback\"', '16 avenue des crireurs\r\n', '0387651292', '', 'Mme Bilo ou M Dra\r\n'),
('ZEA52YE7A', 'entreprise \"Les sentinelles\"', '17 rue des aztèques', '', '0678124556', 'M Babibuouel'),
('ZRR897AZ', 'Société unipersonnelle', '27 rue des Acacias', '00000000', '0000666', 'M. Jean-Karl MALO');


INSERT INTO `salles` (`numeroSalle`, `nom`, `capacite`, `equipements`, `services`, `batiment`) VALUES
(1, 'amphitéatre ', 200, '4 prises éthernet de catégorie 5, système de vidéo projection sur grand écran, 1 prise éthernet régie\r\n', '', 'B'),
(2, 'baccarat ', 40, 'une prise ethernet (catégorie 5 ou 6), système de vidéo projection\r\n', '', 'A'),
(3, 'corbin', 50, 'une prise ethernet (catégorie 5 ou 6), système de vidéo projection\r\n', '', 'A'),
(4, 'daum', 30, 'une prise ethernet (catégorie 5 ou 6), système de vidéo projection\r\n', '', 'A'),
(5, 'gallé', 12, 'une prise ethernet (catégorie 5 ou 6), système de vidéo projection\r\n', '', 'A'),
(6, 'grüber', 24, 'une prise ethernet (catégorie 5 ou 6), système de vidéo projection\r\n', '', 'C'),
(7, 'lamour', 50, 'une prise ethernet (catégorie 5 ou 6), système de vidéo projection\r\n', '', 'B'),
(8, 'longwy', 40, 'une prise ethernet (catégorie 5 ou 6), système de vidéo projection\r\n', '', 'B'),
(9, 'marjorelle', 50, 'une prise ethernet (catégorie 5 ou 6), système de vidéo projection\r\n', '', 'D'),
(10, 'multimédia', 24, '24 ordinateurs, 26 prises ethernet, 1 PC formateur, 1 imprimante réseau\r\n', '', 'B'),
(11, 'restauration et convivialité', 0, 'digicode\r\n', 'aménagement, fourniture eau café ,etc..\r\n', 'D'),
(12, 'Salle de services', 0, '', '', 'B'),
(13, 'Aucune information', 0, '', '', '0'),
(14, 'Administration M2L', 0, '', '', 'C'),
(15, 'Administration M2L', 0, '', '', 'C'),
(16, 'Administration M2L', 0, '', '', 'C'),
(17, 'cuisine', 0, 'test', 'test', 'D'),
(18, 'reprographie', 0, '', '', 'D'),
(25, 'Nouvelle', 15, 'vidéo projecteur', 'nettoyage', '0');


INSERT INTO `intervenants` (`numeroInter`, `nom`, `prenom`, `telephone`, `siret`) VALUES
(1, 'Renault', 'Esteban', 0979873142, '45898745814175'),
(2, 'Bouchet', 'Katell', 0871444782, '45898745814175'),
(3, 'Launay', 'Diego', 0157367282, '11339481784751'),
(4, 'Gillet', 'Arthur', 0579338483, '11339481784751'),
(5, 'Thomas', 'Maryam', 0283762199, '11227435344355'),
(6, 'Cohen', 'Mathieu', 0177793947, '24113495658294'),
(7, 'Masse', 'Océane', 0437878375, '84758493693252'),
(8, 'Vaillant', 'Grégory', 0647168649, '24113495658294'),
(9, 'Carpentier', 'Dimitri', 0972221198, '84758493693252'),
(10, 'Lebrun', 'Noémie', 0776974322, '11227435344355'),
(11, 'Maury', 'Catherine', 0756293341, '45931398235323'),
(12, 'Lebon', 'Jordan', 0656325696, '11339481784751'),
(13, 'Hubert', 'Rémi', 0697996679, '11339481784751'),
(14, 'Moulin', 'Bruno', 0169816442, '45931398235323'),
(15, 'Chapuis', 'Jordan', 0945991665, '24113495658294'),
(16, 'Blondeau', 'Anna', 0442436759, '24113495658294'),
(17, 'Bonnet', 'Léane', 0752466418, '45898745814175'),
(18, 'Parmentier', 'Thibault', 0398213423, '45898745814175'),
(19, 'Petit', 'Gilbert', 0449557599, '45931398235323'),
(20, 'Loiseau', 'Chloé', 0883568826, '45931398235323'),
(21, 'Maillard', 'Hugo', 0636143732, '45931398235323'),
(22, 'Raymond', 'Bruno', 0884884976, '45898745814175'),
(23, 'Thiery', 'Tatiana', 0922211885, '45898745814175'),
(24, 'Perrin', 'Evan', 0433893478, '11227435344355'),
(25, 'Courtois', 'Constant', 0733679865, '11339481784751'),
(26, 'Alves', 'Dorian', 0295731364, '84758493693252'),
(27, 'Baron', 'Émilie', 0276572394, '84758493693252'),
(28, 'Charpentier', 'Laura', 0261764844, '11339481784751'),
(29, 'Laroche', 'Margaux', 0523962196, '11227435344355'),
(30, 'Arnaud', 'Fanny', 0893123293, '45898745814175');

INSERT INTO `interventions` (`idInter`, `numSalle`, `numIntervenant`, `date`, `heure`, `motif`) VALUES
(1, 1, 6, '2019-11-24', '09:00:00', 'Nettoyage de l\'amphi'),
(3, 14, 30, '2019-11-25', '10:00:00', 'Ajout de prises côté porte'),
(4, 15, 30, '2019-11-25', '10:00:00', 'Ajout de prises côté porte'),
(5, 16, 30, '2019-11-25', '10:00:00', 'Ajout de prises côté porte');

INSERT INTO `reservations` (`id`, `dateres`, `heuredeb`, `heurefin`, `batiment`, `complement`, `motif`, `codeclient`, `numsalle`) VALUES
(1, '2015-04-13', '13:00:00', '14:30:00', 'A', '', 'réunion d\'affaire', 'ZEA52YE7A', 4),
(2, '2015-04-13', '14:30:00', '16:00:00', 'A', '', '', '123Y4Z0E8', 4),
(3, '2015-09-12', '08:00:00', '12:00:00', 'B', '', 'Assemblée générale', '3TR6D9SK', 1),
(4, '2016-01-16', '16:00:00', '18:00:00', 'B', '', 'Assemblée générale', '3TR6D9SK', 1),
(5, '2010-09-10', '08:00:00', '12:00:00', 'B', '', 'Assemblée générale', '3TR6D9SK', 1),
(6, '2016-01-03', '10:00:00', '16:00:00', 'D', 'fourniture d\'eau et aménagement', 'réception', 'D437AER9U', 11);



--
-- Déchargement des données de la table `ouvrages`
--

INSERT INTO `ouvrages` (`cote`, `auteur`, `titre`, `anneeParution`, `type`) VALUES
(1, 'Patrick Chamoiseau', 'Maman Dlo contre la fée Carabosse', 1981, 'theatre-conte'),
(2, 'Patrick Chamoiseau', 'Au temps de l\'antan', 1988, 'conte'),
(3, 'Patrick Chamoiseau', 'Texaco', 1992, 'roman'),
(4, 'Patrick Chamoiseau', 'L\'esclave, le vieil homme et le molosse', 1997, 'conte'),
(5, 'Patrick Chamoiseau', 'Les neuf consciences du Malfini', 2009, 'roman'),
(6, 'Raphael Confiant', 'Jou baré', 1977, 'poesie'),
(7, 'Raphael Confiant', 'Marisos', 1987, 'roman'),
(8, 'Raphael Confiant', 'Le nègre et l\'amiral', 1988, 'roman'),
(9, 'Raphael Confiant', 'Les maitres de la parole créole', 1995, 'conte'),
(10, 'Raphael Confiant', 'Brin d\'amour', 2001, 'roman'),
(11, 'Raphael Confiant', 'Citoyens au-dessus de tout soupçon', 2010, 'roman'),
(12, 'Frantz Fanon', 'Peau noire, masques blancs', 1952, 'roman'),
(13, 'Frantz Fanon', 'Les damnés de la terre', 1961, 'roman'),
(14, 'Edouard Glissant', 'La terre inquiète', 1955, 'poesie'),
(15, 'Edouard Glissant', 'Pays rêve, pays réel', 1985, 'poesie'),
(16, 'Edouard Glissant', 'La lézarde', 1958, 'roman'),
(17, 'Edouard Glissant', 'Tout-monde', 1995, 'roman'),
(18, 'Edouard Glissant', 'Ormerod', 2003, 'roman'),
(19, 'Edouard Glissant', 'Monsieur Toussaint', 2003, 'theatre'),
(20, 'Daniel  Maximin', 'L\'isolé soleil', 1981, 'roman'),
(21, 'Daniel  Maximin', 'Lone Sun', 1989, 'roman'),
(22, 'Daniel  Maximin', 'L\'île et une nuit', 2002, 'roman'),
(23, 'Xavier Orville', 'Délice et le fromager', 1977, 'roman'),
(24, 'Xavier Orville', 'Moi, Trésilien-Theodore Auguste', 1996, 'roman'),
(25, 'Xavier Orville', 'Le parfum des belles de nuit', 1996, 'nouvelle'),
(26, 'Gisèle Pineau', 'Un papillon dans la cité', 1992, 'roman'),
(27, 'Gisèle Pineau', 'Mes quatre femmes', 2007, 'roman'),
(28, 'Gisèle Pineau', 'Folie, aller simple: Journée ordinaires d\'une infirmière', 2010, 'roman'),
(29, 'Joseph Zobel', 'Le soleil partagé', 1964, 'nouvelle'),
(30, 'Joseph Zobel', 'Et si la mer n\'etait pas bleue', 1982, 'nouvelle'),
(31, 'Joseph Zobel', 'Le soleil m\'a dit', 2002, 'po?sie'),
(32, 'AImé Césaire', 'Cahier d\'un retour au pays natal', 1939, 'poesie'),
(33, 'AImé Césaire', 'Les armes miraculeuses', 1946, 'poesie'),
(34, 'AImé Césaire', 'Cadastre', 1961, 'poesie'),
(35, 'AImé Césaire', 'Sept poèmes', 2010, 'poesie'),
(36, 'AImé Césaire', 'La tragédie du roi Christophe', 1963, 'theatre'),
(37, 'AImé Césaire', 'Une saison au Congo', 1966, 'theatre'),
(38, 'Saint-John Perse', 'Eloges', 1911, 'poesie'),
(39, 'Saint-John Perse', 'Anabase', 1924, 'poesie'),
(40, 'Saint-John Perse', 'Sécheresse', 1974, 'poesie');

COMMIT;