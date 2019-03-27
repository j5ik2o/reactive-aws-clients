// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ Record => ScalaRecord, _ }
import com.amazonaws.services.dynamodbv2.model.{ Record => JavaRecord }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object RecordOps {

  implicit class ScalaRecordOps(val self: ScalaRecord) extends AnyVal {

    def toJava: JavaRecord = {
      val result = new JavaRecord()
      self.eventID.filter(_.nonEmpty).foreach(v => result.withEventID(v)) // String
      self.eventName.foreach { v =>
        import OperationTypeOps._; result.withEventName(v.toJava)
      } // String
      self.eventVersion.filter(_.nonEmpty).foreach(v => result.withEventVersion(v)) // String
      self.eventSource.filter(_.nonEmpty).foreach(v => result.withEventSource(v))   // String
      self.awsRegion.filter(_.nonEmpty).foreach(v => result.withAwsRegion(v))       // String
      self.dynamodb.foreach { v =>
        import StreamRecordOps._; result.withDynamodb(v.toJava)
      } // StreamRecord
      self.userIdentity.foreach { v =>
        import IdentityOps._; result.withUserIdentity(v.toJava)
      } // Identity

      result
    }

  }

  implicit class JavaRecordOps(val self: JavaRecord) extends AnyVal {

    def toScala: ScalaRecord = {
      ScalaRecord()
        .withEventID(Option(self.getEventID)) // String
        .withEventName(Option(self.getEventName).map { v =>
          import OperationTypeOps._; v.toScala
        }) // String
        .withEventVersion(Option(self.getEventVersion)) // String
        .withEventSource(Option(self.getEventSource)) // String
        .withAwsRegion(Option(self.getAwsRegion)) // String
        .withDynamodb(Option(self.getDynamodb).map { v =>
          import StreamRecordOps._; v.toScala
        }) // StreamRecord
        .withUserIdentity(Option(self.getUserIdentity).map { v =>
          import IdentityOps._; v.toScala
        }) // Identity
    }

  }

}
