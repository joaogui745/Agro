CREATE VIEW LocalidadesPorProprietario AS
SELECT loc.nome, loc.nisPastor, loc.idFazenda, loc.area, loc.foto, prop.email
FROM localidade loc
JOIN fazenda faz ON loc.idFazenda = faz.idFazenda
JOIN proprietario prop ON prop.email = faz.email