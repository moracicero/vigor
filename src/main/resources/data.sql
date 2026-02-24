INSERT INTO plan (nombre, codigo, precio_usd, duracion_semanas, descripcion, incluye, objetivos, destacado, cta_texto, cta_url)
VALUES
('VIGOR ELITE', 'ELITE', NULL, NULL,
'Programa 1 a 1 con Matteo. Resultados reales, medibles y sin margen de error.',
'Plan de entrenamiento individual|Plan nutricional fase por fase|Llamadas semanales privadas|Contacto directo 24/7 vía WhatsApp|Revisión técnica por video|Acceso al ecosistema educativo|Chequeos mensuales|Compromiso mínimo 3 meses',
NULL,
TRUE,
'Agendar llamada para aplicar',
'/contacto'),

('VIGOR START', 'START', 30, 6,
'Programa de 6 semanas para construir base física y mental.',
'Bases del entrenamiento|Bases de nutrición|Hábitos y mentalidad|Entrenamiento en app (6 semanas)|Plan nutricional según objetivo|Bonus incluido|Contacto por formulario en semana 4',
'Aumento de masa muscular|Reducción de porcentaje graso|Recomposición corporal',
FALSE,
'Comprar',
'/contacto'),

('VIGOR INTERMEDIATE', 'INTERMEDIATE', 50, 8,
'Programa de 8 semanas que prioriza optimizar tus entrenamientos (el más atractivo).',
'Nivel 2 entrenamiento/nutrición/mentalidad|Entrenamiento en app (8 semanas)|Plan nutricional educativo|Bonus incluido|Grupo VIGOR|Chequeo cada 4 semanas',
'Aumento de masa muscular|Reducción de porcentaje graso|Recomposición corporal',
FALSE,
'Comprar',
'/contacto'),

('VIGOR ADVANCE / PRO', 'PRO', 90, 12,
'Programa de 12 semanas: manejo real de intensidad (nivel 3).',
'Planificación por bloques|Variaciones cada 4 semanas|Plan nutricional ajustado cada 4 semanas|Bonus PRO|Grupo PRO + VIGOR|2 llamadas (inicio y semana 6)|Contacto por formulario cada 4 semanas|App 12 semanas',
NULL,
FALSE,
'Comprar',
'/contacto');