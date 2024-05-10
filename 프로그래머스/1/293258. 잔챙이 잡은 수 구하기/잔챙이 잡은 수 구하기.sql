select count(*) AS FISH_COUNT
from FISH_INFO
where LENGTH <= 10 OR LENGTH IS NULL;
