package com.firdavs.persistence.entitites;


import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "TIME_TEST")
public class TimeTest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TIME_TEST_ID")
    private long timeTestId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATETIME_COLUMN")
    private Date dateTimeColumn;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TIMESTAMP_COLUMN")
    private Date timeStempColumn;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_COLUMN")
    private Date dateColumn;

    @Temporal(TemporalType.TIME)
    @Column(name = "TIME_COLUMN")
    private Date timeColumn;


    @Column(name = "SQL_DATETIME_COLUMN")
    private java.sql.Timestamp sqlDatetimeColumn;


    @Column(name = "SQL_TIMESTAMP_COLUMN")
    private java.sql.Timestamp sqlTimeStampColumn;



    @Column(name = "SQL_DATE_COLUMN")
    private java.sql.Date sqlDateColumn;


    @Column(name = "SQL_TIME_COLUMN")
    private java.sql.Time sqlTimeColumn;


    public TimeTest(Date date) {
        this.dateTimeColumn = date;
        this.timeStempColumn = date;
        this.timeColumn = date;
        this.dateColumn = date;

        this.sqlDatetimeColumn = new java.sql.Timestamp(date.getTime());
        this.sqlTimeStampColumn = new java.sql.Timestamp(date.getTime());
        this.sqlDateColumn = new java.sql.Date(date.getTime());
        this.sqlTimeColumn = new java.sql.Time(date.getTime());
    }

    public long getTimeTestId() {
        return timeTestId;
    }

    public void setTimeTestId(long timeTestId) {
        this.timeTestId = timeTestId;
    }

    public Date getDateTimeColumn() {
        return dateTimeColumn;
    }

    public void setDateTimeColumn(Date dateTimeColumn) {
        this.dateTimeColumn = dateTimeColumn;
    }

    public Date getTimeStempColumn() {
        return timeStempColumn;
    }

    public void setTimeStempColumn(Date timeStempColumn) {
        this.timeStempColumn = timeStempColumn;
    }

    public Date getDateColumn() {
        return dateColumn;
    }

    public void setDateColumn(Date dateColumn) {
        this.dateColumn = dateColumn;
    }

    public Date getTimeColumn() {
        return timeColumn;
    }

    public void setTimeColumn(Date timeColumn) {
        this.timeColumn = timeColumn;
    }

    public Timestamp getSqlDatetimeColumn() {
        return sqlDatetimeColumn;
    }

    public void setSqlDatetimeColumn(Timestamp sqlDatetimeColumn) {
        this.sqlDatetimeColumn = sqlDatetimeColumn;
    }

    public Timestamp getSqlTimeStampColumn() {
        return sqlTimeStampColumn;
    }

    public void setSqlTimeStampColumn(Timestamp sqlTimeStampColumn) {
        this.sqlTimeStampColumn = sqlTimeStampColumn;
    }

    public java.sql.Date getSqlDateColumn() {
        return sqlDateColumn;
    }

    public void setSqlDateColumn(java.sql.Date sqlDateColumn) {
        this.sqlDateColumn = sqlDateColumn;
    }

    public Time getSqlTimeColumn() {
        return sqlTimeColumn;
    }

    public void setSqlTimeColumn(Time sqlTimeColumn) {
        this.sqlTimeColumn = sqlTimeColumn;
    }

    @Override
    public String toString() {
        return "TimeTest{" +
                "timeTestId=" + timeTestId +
                ", dateTimeColumn=" + dateTimeColumn +
                ", timeStempColumn=" + timeStempColumn +
                ", dateColumn=" + dateColumn +
                ", timeColumn=" + timeColumn +
                ", sqlDatetimeColumn=" + sqlDatetimeColumn +
                ", sqlTimeStampColumn=" + sqlTimeStampColumn +
                ", sqlDateColumn=" + sqlDateColumn +
                ", sqlTimeColumn=" + sqlTimeColumn +
                '}';
    }
}
