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
      <div className="flex justify-center">
        <div
          className="debug grid md:grid-cols-4 gap-x-3.5 overflow-scroll md:px-20 px-10"
          dir="rtl"
        >
          {allSurahs.map((val) => (
            <div className="mx-auto col-span-1" key={val.id}>
              <ListItem
                content={`${val.surah} - ${val.surrahname}`}
                surahNum={val.surah}
              />
            </div>
          ))}
        </div>
      </div>
    </>
  );
}
