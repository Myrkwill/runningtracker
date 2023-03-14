package ru.myrkwill.runningapp.repositories

import ru.myrkwill.runningapp.db.Run
import ru.myrkwill.runningapp.db.RunDAO
import javax.inject.Inject

class MainRepository @Inject constructor(
    val runDAO: RunDAO
) {
    suspend fun insertRun(run: Run) = runDAO.insertRun(run)

    suspend fun deleteRun(run: Run) = runDAO.deleteRun(run)

    fun getAllRunsSortedByDate() = runDAO.getAllRunsSortedByDate()

    fun getAllRunsSortedByAvgSpeedInKMH() = runDAO.getAllRunsSortedByAvgSpeedInKMH()

    fun getAllRunsSortedByTimeInMillis() = runDAO.getAllRunsSortedByTimeInMillis()

    fun getAllRunsSortedByCaloriesBurned() = runDAO.getAllRunsSortedByCaloriesBurned()

    fun getAllRunsSortedByDistanceInMeters() = runDAO.getAllRunsSortedByDistanceInMeters()

    fun getTotalTimeInMillis() = runDAO.getTotalTimeInMillis()

    fun getTotalCaloriesBurned() = runDAO.getTotalCaloriesBurned()

    fun getTotalDistanceInMeters() = runDAO.getTotalDistanceInMeters()

    fun getTotalAvgSpeedInKMH() = runDAO.getTotalAvgSpeedInKMH()
}