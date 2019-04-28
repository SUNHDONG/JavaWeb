create table video_ori(
    videoId string,
    uploader string,
    age int, 
    category array<string>,
    length int, 
    views int, 
    rate float, 
    ratings int, 
    comments int,
    relatedId array<string>)
row format delimited 
fields terminated by "\t"
collection items terminated by "&"