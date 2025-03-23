import { useEffect, useState } from "react";
import reactLogo from "../assets/react.svg";
import viteLogo from "/vite.svg";
import { getAllSurahs } from "../utils/FetchSurahs";
import ListItem from "../components/ListItem";

export default function HomePage() {
  const [count, setCount] = useState(0);
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
      <div className="flex justify-center">
        <div className="max-h-full debug">
          {allSurahs.map((val) => (
            <div className="mx-auto" key={val.id}>
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
