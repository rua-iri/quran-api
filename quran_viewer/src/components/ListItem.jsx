export default function ListItem({ content, surahNum }) {
  return (
    <a href={`/surah/${surahNum}`}>
      <div className="my-3 outline outline-slate-400 w-52 rounded">
        {content}
      </div>
    </a>
  );
}
