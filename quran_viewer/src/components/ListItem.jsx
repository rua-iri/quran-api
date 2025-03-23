export default function ListItem({ content, surahNum }) {
  return (
    <div className="my-3 outline outline-slate-400 w-52 rounded">
      <a href={`/surah/${surahNum}`}>{content}</a>
    </div>
  );
}
