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
        <a href="https://vite.dev" target="_blank">
          <img src={viteLogo} className="logo" alt="Vite logo" />
        </a>
        <a href="https://react.dev" target="_blank">
          <img src={reactLogo} className="logo react" alt="React logo" />
        </a>
      </div>
      <h1>Vite + React</h1>
      {allSurahs.map((val) => (
        <div key={val.id}>
          <ListItem
            content={`${val.surah} - ${val.surrahname}`}
            surahNum={val.surah}
          />
        </div>
      ))}
      <div className="card">
        <button onClick={() => setCount((count) => count + 1)}>
          count is {count}
        </button>
        <p>
          Edit <code>src/App.jsx</code> and save to test HMR
        </p>
      </div>
      <p className="read-the-docs">
        Click on the Vite and React logos to learn more
      </p>
    </>
  );
}
