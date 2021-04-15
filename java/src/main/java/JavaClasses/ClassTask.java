package JavaClasses;

import java.util.ArrayList;
import java.util.List;

public class ClassTask {
    public static void main(String[] args) {
        PatientOperations patientList = new PatientOperations();
        patientList.addPatient(new Patient(132, "Волкова", "Инна", "Сергеевна",
                "Квадрант Сигма-18", "103-343-535", 20645,
                "Клиническая лень"));
        patientList.addPatient(new Patient(5163, "Кошкин", "Евгений", "Олегович",
                "Квадрант Альфа-20", "464-342-235", 2045,
                "Вывих уха"));
        patientList.addPatient(new Patient(93545, "Драконова", "Оксана", "Сергеевна",
                "Квадрант Омега-30", "256-846-626", 14045,
                "Удлинение хвоста"));
        patientList.addPatient(new Patient(725, "Вивернов", "Антон", "Василиевич",
                "Квадрант Бета-3", "951-546-225", 20345,
                "Чрезмерный рост чешуи"));
        patientList.addPatient(new Patient(2566, "Кобольдова", "Лиза", "Алексеевна",
                "Квадрант Дельта-61", "643-754-246", 57052,
                "Удлинение хвоста"));
        patientList.addPatient(new Patient(753674, "Вирмов", "Алексей", "Егорович",
                "Квадрант Гамма-32", "456-754-256", 15203,
                "Избыточный рост рогов"));
        patientList.addPatient(new Patient(4624, "Кусачева", "Валерия", "Евгеньевна",
                "Квадрант Ро-42", "567-234-745", 45729,
                "Удлинение хвоста"));

        System.out.println("Список пациентов, имеющих диагноз \"Удлинение хвоста\":");
        List<Patient> patientsWithDiagnosis = patientList.findPatientsWithDiagnosis("Удлинение хвоста");
        for (Patient p : patientsWithDiagnosis) {
            System.out.println(p);
        }

        System.out.println("\nСписок пациентов, номер медицинской карты которых находится в интервале 10000-30000:");
        List<Patient> patientsInRange = patientList.findPatientsWithCardNumberWithinRange(10000, 30000);
        for (Patient p : patientsInRange) {
            System.out.println(p);
        }
    }

    static class Patient {
        private int id;
        private String name;
        private String surname;
        private String patronymic;
        private String address;
        private String phoneNumber;
        private int medicalCardNumber;
        private String diagnosis;

        Patient(int id, String surname, String name, String patronymic, String address,
                String phoneNumber, int medicalCardNumber, String diagnosis) {
            this.id = id;
            this.name = name;
            this.surname = surname;
            this.patronymic = patronymic;
            this.address = address;
            this.phoneNumber = phoneNumber;
            this.medicalCardNumber = medicalCardNumber;
            this.diagnosis = diagnosis;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public String getPatronymic() {
            return patronymic;
        }

        public void setPatronymic(String patronymic) {
            this.patronymic = patronymic;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public int getMedicalCardNumber() {
            return medicalCardNumber;
        }

        public void setMedicalCardNumber(int medicalCardNumber) {
            this.medicalCardNumber = medicalCardNumber;
        }

        public String getDiagnosis() {
            return diagnosis;
        }

        public void setDiagnosis(String diagnosis) {
            this.diagnosis = diagnosis;
        }

        @Override
        public String toString() {
            return String.format("id: %d, surname: %s, name: %s, patronymic: %s, address: %s, phoneNumber: %s, " +
                            "medicalCardNumber: %d, diagnosis: %s", id, surname, name, patronymic, address, phoneNumber,
                    medicalCardNumber, diagnosis);
        }
    }

    static class PatientOperations {
        List<Patient> patientList = new ArrayList<>();

        public void addPatient(Patient patient) {
            patientList.add(patient);
        }

        List<Patient> findPatientsWithDiagnosis(String diagnosis) {
            List<Patient> foundPatients = new ArrayList<>();
            for (Patient p : patientList) {
                if (p.getDiagnosis().equals(diagnosis)) {
                    foundPatients.add(p);
                }
            }
            return foundPatients;
        }

        List<Patient> findPatientsWithCardNumberWithinRange(int startRange, int endRange) {
            List<Patient> checkedPatients = new ArrayList<>();
            for (Patient p : patientList) {
                if (p.getMedicalCardNumber() >= startRange && p.getMedicalCardNumber() <= endRange) {
                    checkedPatients.add(p);
                }
            }
            return checkedPatients;
        }
    }
}




