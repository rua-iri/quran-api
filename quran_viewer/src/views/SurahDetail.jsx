import { useEffect, useState } from "react";
import { useLocation } from "react-router";
import { getSurahByID } from "../utils/FetchSurahs";
import AyahItem from "../components/AyahItem";
import LoadingIcon from "../components/LoadingIcon";

export default function SurahDetail() {
  const [surahAyahs, setSurahAyahs] = useState([]);
  const location = useLocation();
  const surahNumber = location.pathname.replace("/surah/", "");

  async function getSurahAyahs() {
    const data = await getSurahByID(surahNumber);
    console.log(data);
    setSurahAyahs(data);
  }

  useEffect(() => {
    getSurahAyahs();
  }, []);

  return (
    <>
      <div>{location.pathname}</div>
      <div>Fetching Surah Number: '{surahNumber}'</div>

      <LoadingIcon />

      <div className="mx-52">
        {surahAyahs.map((item) => (
          <AyahItem key={item.id} number={item.ayah} content={item.ayah_text} />
        ))}
      </div>
    </>
  );
}
