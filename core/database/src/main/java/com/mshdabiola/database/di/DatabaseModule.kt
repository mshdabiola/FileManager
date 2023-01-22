package com.mshdabiola.database.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object DatabaseModule {

//    @Provides
//    @Singleton
//    fun databaseProvider(
//        @ApplicationContext context: Context
//    ): LudoDatabase {
//        return Room.databaseBuilder(context, NoteDatabase::class.java, "ludoDb.db")
//            .build()
////        return Room.inMemoryDatabaseBuilder(context,LudoDatabase::class.java,)
////            .build()
//    }

//    @Provides
//    @Singleton
//    fun playerDaoProvider(ludoDatabase: LudoDatabase): PlayerDao {
//        return ludoDatabase.getPlayerDao()
//    }
//
//    @Provides
//    @Singleton
//    fun pawnDaoProvider(ludoDatabase: LudoDatabase): PawnDao {
//        return ludoDatabase.getPawnDao()
//    }
//
//    @Provides
//    @Singleton
//    fun ludoDaoProvider(ludoDatabase: LudoDatabase): LudoDao {
//        return ludoDatabase.getLudoDao()
//    }
}
