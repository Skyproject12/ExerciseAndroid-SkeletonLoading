<?xml version="1.0" encoding="utf-8"?>

<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/constraint_registrasi"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/colorWhite"
    tools:context=".Preview.Login.LoginActivity">

    <ScrollView
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent">

        <androidx.constraintlayout.widget.ConstraintLayout
            android:id="@+id/ll_constraint"
            android:layout_width="match_parent"
            android:layout_height="wrap_content">

            <Button
                android:id="@+id/button_facebook"
                android:layout_width="0dp"
                android:layout_height="40dp"
                android:layout_marginStart="@dimen/activity_margin_enambelas"
                android:layout_marginEnd="@dimen/activity_margin_enambelas"
                android:background="@drawable/background_button_login_facebook"
                android:drawableStart="@drawable/background_icon_facebook"
                android:drawableLeft="@drawable/background_icon_facebook"
                android:gravity="center"
                android:text="@string/facebook"
                android:textColor="@color/colorWhite"
                android:textSize="12sp"
                app:layout_constraintBottom_toBottomOf="@+id/button_google"
                app:layout_constraintEnd_toEndOf="parent"
                app:layout_constraintHorizontal_bias="0.0"
                app:layout_constraintStart_toStartOf="@+id/guideline4"
                app:layout_constraintTop_toTopOf="@+id/button_google" />

            <Button
                android:id="@+id/button_daftar"
                android:layout_width="0dp"
                android:layout_height="wrap_content"
                android:layout_marginStart="@dimen/activity_margin_enambelas"
                android:layout_marginLeft="@dimen/activity_margin_enambelas"
                android:layout_marginTop="@dimen/activity_margin_duaempat"
                android:layout_marginEnd="@dimen/activity_margin_enambelas"
                android:layout_marginRight="@dimen/activity_margin_enambelas"
                android:background="@drawable/background_button"
                android:text="@string/daftar"
                android:textColor="@color/colorBrow"
                app:layout_constraintEnd_toEndOf="parent"
                app:layout_constraintHorizontal_bias="0.0"
                app:layout_constraintStart_toStartOf="parent"
                app:layout_constraintTop_toBottomOf="@+id/input_lama_password" />


            <EditText
                android:id="@+id/input_nama_lengkap"
                android:layout_width="0dp"
                android:layout_height="wrap_content"
                android:layout_marginStart="@dimen/activity_margin_enambelas"
                android:layout_marginLeft="@dimen/activity_margin_enambelas"
                android:layout_marginTop="32dp"
                android:layout_marginEnd="@dimen/activity_margin_enambelas"
                android:layout_marginRight="@dimen/activity_margin_enambelas"
                android:background="@drawable/background_input_login"
                android:ems="10"
                android:hint="@string/nama_lengkap"
                android:inputType="textPersonName"
                android:paddingLeft="@dimen/activity_margin_enambelas"
                android:paddingTop="10dp"
                android:paddingBottom="10dp"
                android:textColor="@color/colorEditText"
                app:layout_constraintEnd_toEndOf="parent"
                app:layout_constraintHorizontal_bias="0.445"
                app:layout_constraintStart_toStartOf="parent"
                app:layout_constraintTop_toBottomOf="@+id/textView10" />

            <EditText
                android:id="@+id/input_alamat_email"
                android:layout_width="0dp"
                android:layout_height="wrap_content"
                android:layout_marginStart="@dimen/activity_margin_enambelas"
                android:layout_marginLeft="@dimen/activity_margin_enambelas"
                android:layout_marginTop="8dp"
                android:layout_marginEnd="@dimen/activity_margin_enambelas"
                android:layout_marginRight="@dimen/activity_margin_enambelas"
                android:background="@drawable/background_input_login"
                android:ems="10"
                android:hint="@string/alamat_email"
                android:inputType="textPersonName|textEmailAddress"
                android:paddingLeft="@dimen/activity_margin_enambelas"
                android:paddingTop="10dp"
                android:paddingBottom="10dp"
                android:textColor="@color/colorEditTe