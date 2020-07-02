// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class StreamRecordBuilderOps(val self: StreamRecord.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def approximateCreationDateTimeAsScala(value: Option[java.time.Instant]): StreamRecord.Builder = {
    value.fold(self) { v => self.approximateCreationDateTime(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keysAsScala(value: Option[Map[String, AttributeValue]]): StreamRecord.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.keys(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def newImageAsScala(value: Option[Map[String, AttributeValue]]): StreamRecord.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.newImage(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def oldImageAsScala(value: Option[Map[String, AttributeValue]]): StreamRecord.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.oldImage(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sequenceNumberAsScala(value: Option[String]): StreamRecord.Builder = {
    value.fold(self) { v => self.sequenceNumber(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sizeBytesAsScala(value: Option[Long]): StreamRecord.Builder = {
    value.fold(self) { v => self.sizeBytes(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def streamViewTypeAsScala(value: Option[StreamViewType]): StreamRecord.Builder = {
    value.fold(self) { v => self.streamViewType(v) }
  }

}

final class StreamRecordOps(val self: StreamRecord) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def approximateCreationDateTimeAsScala: Option[java.time.Instant] = Option(self.approximateCreationDateTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keysAsScala: Option[Map[String, AttributeValue]] =
    Option(self.keys).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def newImageAsScala: Option[Map[String, AttributeValue]] =
    Option(self.newImage).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def oldImageAsScala: Option[Map[String, AttributeValue]] =
    Option(self.oldImage).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sequenceNumberAsScala: Option[String] = Option(self.sequenceNumber)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sizeBytesAsScala: Option[Long] = Option(self.sizeBytes)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def streamViewTypeAsScala: Option[StreamViewType] = Option(self.streamViewType)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStreamRecordOps {

  implicit def toStreamRecordBuilderOps(v: StreamRecord.Builder): StreamRecordBuilderOps = new StreamRecordBuilderOps(v)

  implicit def toStreamRecordOps(v: StreamRecord): StreamRecordOps = new StreamRecordOps(v)

}
