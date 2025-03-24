import { Outlet } from "react-router";
import DashboardHeader from "../components/DashboardHeader";
import "../App.css";

export default function Dashboard() {
  return (
    <div className="h-screen flex flex-col">
      <div className="h-28">
        <DashboardHeader />
      </div>
      <div className="flex-1 overflow-auto p-4">
        <Outlet />
      </div>
    </div>
  );
}
