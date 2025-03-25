import { useEffect, useState } from "react";
import { getAllSurahs } from "../utils/FetchSurahs";
import ListItem from "../components/ListItem";
import LoadingIcon from "../components/LoadingIcon";

export default function HomePage() {
  const [allSurahs, setAllSurahs] = useState([]);

  async function requestSurahs() {
    setAllSurahs(await getAllSurahs());
    console.log(allSurahs);
  }

  useEffect(() => {
    requestSurahs();
  }, []);

  return (
    <>
      {allSurahs.length == 0 && <LoadingIcon />}
      <div className="flex flex-col justify-center align-middle py-3 outline outline-slate-500 rounded md:px-20 px-10">
        <h1 className="text-4xl font-bold mb-10">
          Surahs
        </h1>
        <div
          className="grid md:grid-cols-4 gap-x-3.5 overflow-scroll px-2"
          dir="rtl"
        >
          {allSurahs.map((val) => (
            <div className="mx-auto col-span-1" key={val.id}>
              <ListItem surahNumber={val.surah} surahName={val.surrahname} />
            </div>
          ))}
        </div>
      </div>
    </>
  );
}
