import { ArrowLongLeftIcon } from "@heroicons/react/20/solid";

export default function ListItem({ surahNumber, surahName }) {
  const colourArray = ["red-500", "green-500", "blue-500"];

  const colorIndex = surahNumber % colourArray.length;
  const itemColor = `border-t-${colourArray[colorIndex]}`;
  console.log(surahNumber + " - '" + itemColor + "'");

  return (
    <a
      className={`my-3 p-3 outline flex flex-col outline-slate-400 w-52 rounded hover:bg-amber-100 focus:bg-amber-100 hover:bg-opacity-10 border-t-4 ${itemColor} shadow shadow-black`}
      href={`/surah/${surahNumber}`}
    >
      <h1 className="text-xl font-bold">{surahNumber}</h1>
      <p className="text-lg">{surahName}</p>
      <ArrowLongLeftIcon className="h-10 w-20 mt-3" />
    </a>
  );
}
