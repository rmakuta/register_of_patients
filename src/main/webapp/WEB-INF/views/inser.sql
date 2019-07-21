INSERT INTO `company` (`id`, `city`, `house_number`, `name`, `nip`, `number_phone`, `postal_code`, `street`) VALUES
(7, 'Krotoszyn', '123', 'Dino', '6211115566', '555 555 555', '63-700', 'Ostrowska'),
(2, 'Krotoszyn', '6', 'Mahle', '6215553322', '444 444 444', '63-700', 'Mahle'),
(3, 'Krotoszyn', '7', 'Jotkel', '6210005621', '333 333 333', '63-700', 'Wiejska'),
(4, 'Krotoszyn', '87', 'Fugor', '6215552332', '222 222 222', '63-700', 'Kobylinska');

INSERT INTO `user` (`id`, `city`, `first_name`, `house_number`, `last_name`, `pesel`, `number_phone`, `postal_code`, `street`) VALUES
(7, 'Krotoszyn', 'Jan', '123', 'Kowalski', '6211115566', '555 555 555', '63-700', 'Ostrowska'),
(2, 'Krotoszyn', 'Pawel', '6', 'Nowak', '6215553322', '444 444 444', '63-700', 'Mahle'),
(3, 'Krotoszyn', 'Michal', '7', 'Krol', '6210005621', '333 333 333', '63-700', 'Wiejska'),
(4, 'Krotoszyn', 'Piotr', '87', 'Duda', '6215552332', '222 222 222', '63-700', 'Kobylinska');

INSERT INTO `testing` (`id`, `name`) VALUES
(1, 'Aparat krzyzowy'),
(2, 'MRK'),
(3, 'Wirometr'),
(4, 'Widzenie stereoskopowe'),
(5, 'Wrazliwisc na olsnienie'),
(6, 'Widzenie w zmroku'),
(7, 'Test  Tablic Poppelreutera'),
(8, 'NEO-FFI'),
(9, 'Raven');

INSERT INTO `qualification` (`id`, `name`) VALUES
(1, 'operator wozka jezdniowego'),
(2, 'operator koparko – ladowarki'),
(3, 'operator suwnicy'),
(4, ' kierowanie poj. do 3,5 t w ramach wykonywania obowiazkow sluzbowych'),
(5, 'widzenie zmierzchowe i wrazliwosc na olsnienie');