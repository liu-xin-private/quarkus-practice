INSERT INTO fruitEntity(id, name) VALUES (1, 'Cherry');
INSERT INTO fruitEntity(id, name) VALUES (2, 'Apple');
INSERT INTO fruitEntity(id, name) VALUES (3, 'Banana');

-- force using the same if for entity and repository to facilitate testing
INSERT INTO fruit(id, name) VALUES (1, 'Cherry');
INSERT INTO fruit(id, name) VALUES (2, 'Apple');
INSERT INTO fruit(id, name) VALUES (3, 'Banana');