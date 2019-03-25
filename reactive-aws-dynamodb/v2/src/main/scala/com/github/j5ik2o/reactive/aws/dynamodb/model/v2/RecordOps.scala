package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ Record => ScalaRecord, _ }
import software.amazon.awssdk.services.dynamodb.model.{ Record => JavaRecord }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object RecordOps {

  implicit class ScalaRecordOps(val self: ScalaRecord) extends AnyVal {

    def toJava: JavaRecord = {
      val result = JavaRecord.builder()
      self.eventID.filter(_.nonEmpty).foreach(v => result.eventID(v)) // String
      self.eventName.foreach { v =>
        import OperationTypeOps._; result.eventName(v.toJava)
      } // String
      self.eventVersion.filter(_.nonEmpty).foreach(v => result.eventVersion(v)) // String
      self.eventSource.filter(_.nonEmpty).foreach(v => result.eventSource(v))   // String
      self.awsRegion.filter(_.nonEmpty).foreach(v => result.awsRegion(v))       // String
      self.dynamodb.foreach { v =>
        import StreamRecordOps._; result.dynamodb(v.toJava)
      } // StreamRecord
      self.userIdentity.foreach { v =>
        import IdentityOps._; result.userIdentity(v.toJava)
      } // Identity

      result.build()
    }

  }

  implicit class JavaRecordOps(val self: JavaRecord) extends AnyVal {

    def toScala: ScalaRecord = {
      ScalaRecord()
        .withEventID(Option(self.eventID)) // String
        .withEventName(Option(self.eventName).map { v =>
          import OperationTypeOps._; v.toScala
        }) // String
        .withEventVersion(Option(self.eventVersion)) // String
        .withEventSource(Option(self.eventSource)) // String
        .withAwsRegion(Option(self.awsRegion)) // String
        .withDynamodb(Option(self.dynamodb).map { v =>
          import StreamRecordOps._; v.toScala
        }) // StreamRecord
        .withUserIdentity(Option(self.userIdentity).map { v =>
          import IdentityOps._; v.toScala
        }) // Identity
    }

  }

}
