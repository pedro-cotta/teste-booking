INSERT INTO country (id, name)
values(1, 'Brasil');


INSERT INTO tb_state (id, name, country_id)
values(1, 'Minas Gerais', 1);

INSERT INTO tb_state (id, name, country_id)
values(2, 'São Paulo', 1);

INSERT INTO city(id, name, state_id)
values(1, 'Belo Horizonte', 1);

INSERT INTO city(id, name, state_id)
values(2, 'São Paulo', 2);

INSERT INTO address(id, street, number, neighborhood, zipcode, complement, city_id)
values (1, 'RUa abobrinha', 1, 'Belem', '03059050', null, 2);

INSERT INTO user(id, register_number, name, active, address_id, type)
values(1, '03940394930110', 'Hotel Pedro', true, 1, 'HO');

INSERT INTO room(id, user_hotel_id, name, description, active, quantity_persons)
values(1, 1, 'SUite master', 'Melhor suite da cidade', true, 4);

INSERT INTO daily_room_config(id, room_id, uavailable_date, available, active, price, schedule_checkout, schedule_checkin)
values(1, 1, '2024-07-15', true, true, 100.0, 10, 14);

INSERT INTO daily_room_config(id, room_id, uavailable_date, available, active, price, schedule_checkout, schedule_checkin)
values(2, 1, '2024-07-16', true, true, 100.0, 10, 14);