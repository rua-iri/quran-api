import { InformationCircleIcon } from "@heroicons/react/20/solid";
import { MagnifyingGlassCircleIcon } from "@heroicons/react/20/solid";

export default function DashboardHeader() {
  const iconClasses = "h-8 w-8";

  return (
      <div className="border-b border-b-slate-500">
        <div className="text-start flex justify-between px-10 py-8">
          <a href="/">
            <h1 className="text-2xl font-bold">Quran Viewer</h1>
          </a>
          <div className="flex">
            <a href="/search" className="mx-3">
              <MagnifyingGlassCircleIcon className={iconClasses} />
            </a>
            <button
              className="mx-3 btn"
              onClick={() => alert("Info Button Clicked")}
            >
              <InformationCircleIcon className={iconClasses} />
            </button>
          </div>
        </div>
      </div>
  );
}
