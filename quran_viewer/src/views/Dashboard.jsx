import { Outlet } from "react-router";
import DashboardHeader from "../components/DashboardHeader";
import "../App.css";

export default function Dashboard() {
  return (
    <div className="">
      <div className="border-b border-b-slate-500">
        <DashboardHeader />
      </div>

      <Outlet />
    </div>
  );
}
