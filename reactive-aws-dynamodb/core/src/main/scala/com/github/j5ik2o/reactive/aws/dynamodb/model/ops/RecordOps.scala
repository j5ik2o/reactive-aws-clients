// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class RecordBuilderOps(val self: Record.Builder) extends AnyVal {

  final def eventIDAsScala(value: Option[String]): Record.Builder = {
    value.fold(self) { v =>
      self.eventID(v)
    }
  }

  final def eventNameAsScala(value: Option[OperationType]): Record.Builder = {
    value.fold(self) { v =>
      self.eventName(v)
    }
  }

  final def eventVersionAsScala(value: Option[String]): Record.Builder = {
    value.fold(self) { v =>
      self.eventVersion(v)
    }
  }

  final def eventSourceAsScala(value: Option[String]): Record.Builder = {
    value.fold(self) { v =>
      self.eventSource(v)
    }
  }

  final def awsRegionAsScala(value: Option[String]): Record.Builder = {
    value.fold(self) { v =>
      self.awsRegion(v)
    }
  }

  final def dynamodbAsScala(value: Option[StreamRecord]): Record.Builder = {
    value.fold(self) { v =>
      self.dynamodb(v)
    }
  }

  final def userIdentityAsScala(value: Option[Identity]): Record.Builder = {
    value.fold(self) { v =>
      self.userIdentity(v)
    }
  }

}

final class RecordOps(val self: Record) extends AnyVal {

  final def eventIDAsScala: Option[String] = Option(self.eventID)

  final def eventNameAsScala: Option[OperationType] = Option(self.eventName)

  final def eventVersionAsScala: Option[String] = Option(self.eventVersion)

  final def eventSourceAsScala: Option[String] = Option(self.eventSource)

  final def awsRegionAsScala: Option[String] = Option(self.awsRegion)

  final def dynamodbAsScala: Option[StreamRecord] = Option(self.dynamodb)

  final def userIdentityAsScala: Option[Identity] = Option(self.userIdentity)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRecordOps {

  implicit def toRecordBuilderOps(v: Record.Builder): RecordBuilderOps = new RecordBuilderOps(v)

  implicit def toRecordOps(v: Record): RecordOps = new RecordOps(v)

}
