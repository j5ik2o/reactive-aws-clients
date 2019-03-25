package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ Record => ScalaRecord, _ }
import software.amazon.awssdk.services.dynamodb.model.{ Record => JavaRecord }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object RecordOps {

  implicit class ScalaRecordOps(val self: ScalaRecord) extends AnyVal {

    def toJava: JavaRecord = {
      val result = JavaRecord.builder()
      self.eventID.filter(_.nonEmpty).foreach(v => result.eventID(v)) // String, case String
      self.eventName.foreach { v =>
        import OperationTypeOps._; result.eventName(v.toJava)
      } // String, case Other
      self.eventVersion.filter(_.nonEmpty).foreach(v => result.eventVersion(v)) // String, case String
      self.eventSource.filter(_.nonEmpty).foreach(v => result.eventSource(v))   // String, case String
      self.awsRegion.filter(_.nonEmpty).foreach(v => result.awsRegion(v))       // String, case String
      self.dynamodb.foreach { v =>
        result.dynamodb(v.toJava)
      } // StreamRecord, case Other
      self.userIdentity.foreach { v =>
        import IdentityOps._; result.userIdentity(v.toJava)
      } // Identity, case Other

      result.build()
    }

  }

  implicit class JavaRecordOps(val self: JavaRecord) extends AnyVal {

    def toScala: ScalaRecord = {
      ScalaRecord()
        .withEventID(Option(self.eventID)) // String
        .withEventName(Option(self.eventName).map { v =>
          import OperationTypeOps._; v.toScala
        }) // String, Map-12
        .withEventVersion(Option(self.eventVersion)) // String
        .withEventSource(Option(self.eventSource)) // String
        .withAwsRegion(Option(self.awsRegion)) // String
        .withDynamodb(Option(self.dynamodb).map { v =>
          v.toScala
        }) // StreamRecord, Map-12
        .withUserIdentity(Option(self.userIdentity).map { v =>
          import IdentityOps._; v.toScala
        }) // Identity, Map-12
    }

  }

}
