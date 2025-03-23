export default function AyahItem({ number, content }) {
  return (
    <div
      className="flex justify-center rounded border border-slate-500 my-2"
      dir="rtl"
    >
      <div>{number}:&nbsp;</div>
      <div>{content}</div>
    </div>
  );
}
