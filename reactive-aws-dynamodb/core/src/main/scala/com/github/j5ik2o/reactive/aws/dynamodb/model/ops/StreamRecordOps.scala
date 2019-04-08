// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class StreamRecordBuilderOps(val self: StreamRecord.Builder) extends AnyVal {

  final def approximateCreationDateTimeAsScala(value: Option[java.time.Instant]): StreamRecord.Builder = {
    value.fold(self) { v =>
      self.approximateCreationDateTime(v)
    }
  } // Instant

  final def keysAsScala(value: Option[Map[String, AttributeValue]]): StreamRecord.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.keys(v.asJava)
    } // Map[String, AttributeValue]
  }

  final def newImageAsScala(value: Option[Map[String, AttributeValue]]): StreamRecord.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.newImage(v.asJava)
    } // Map[String, AttributeValue]
  }

  final def oldImageAsScala(value: Option[Map[String, AttributeValue]]): StreamRecord.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.oldImage(v.asJava)
    } // Map[String, AttributeValue]
  }

  final def sequenceNumberAsScala(value: Option[String]): StreamRecord.Builder = {
    value.fold(self) { v =>
      self.sequenceNumber(v)
    }
  } // String

  final def sizeBytesAsScala(value: Option[Long]): StreamRecord.Builder = {
    value.fold(self) { v =>
      self.sizeBytes(v)
    }
  } // Long

  final def streamViewTypeAsScala(value: Option[StreamViewType]): StreamRecord.Builder = {
    value.fold(self) { v =>
      self.streamViewType(v)
    }
  } // String

}

final class StreamRecordOps(val self: StreamRecord) extends AnyVal {

  final def approximateCreationDateTimeAsScala: Option[java.time.Instant] =
    Option(self.approximateCreationDateTime) // Instant

  final def keysAsScala: Option[Map[String, AttributeValue]] = Option(self.keys).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  } // Map[String, AttributeValue]

  final def newImageAsScala: Option[Map[String, AttributeValue]] = Option(self.newImage).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  } // Map[String, AttributeValue]

  final def oldImageAsScala: Option[Map[String, AttributeValue]] = Option(self.oldImage).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  } // Map[String, AttributeValue]

  final def sequenceNumberAsScala: Option[String] = Option(self.sequenceNumber) // String

  final def sizeBytesAsScala: Option[Long] = Option(self.sizeBytes) // Long

  final def streamViewTypeAsScala: Option[StreamViewType] = Option(self.streamViewType) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStreamRecordOps {

  implicit def toStreamRecordBuilderOps(v: StreamRecord.Builder): StreamRecordBuilderOps = new StreamRecordBuilderOps(v)

  implicit def toStreamRecordOps(v: StreamRecord): StreamRecordOps = new StreamRecordOps(v)

}
