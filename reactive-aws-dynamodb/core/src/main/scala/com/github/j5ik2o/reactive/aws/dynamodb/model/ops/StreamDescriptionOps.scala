// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class StreamDescriptionBuilderOps(val self: StreamDescription.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def streamArnAsScala(value: Option[String]): StreamDescription.Builder = {
    value.fold(self) { v =>
      self.streamArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def streamLabelAsScala(value: Option[String]): StreamDescription.Builder = {
    value.fold(self) { v =>
      self.streamLabel(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def streamStatusAsScala(value: Option[StreamStatus]): StreamDescription.Builder = {
    value.fold(self) { v =>
      self.streamStatus(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def streamViewTypeAsScala(value: Option[StreamViewType]): StreamDescription.Builder = {
    value.fold(self) { v =>
      self.streamViewType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def creationRequestDateTimeAsScala(value: Option[java.time.Instant]): StreamDescription.Builder = {
    value.fold(self) { v =>
      self.creationRequestDateTime(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tableNameAsScala(value: Option[String]): StreamDescription.Builder = {
    value.fold(self) { v =>
      self.tableName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keySchemaAsScala(value: Option[Seq[KeySchemaElement]]): StreamDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.keySchema(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def shardsAsScala(value: Option[Seq[Shard]]): StreamDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.shards(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastEvaluatedShardIdAsScala(value: Option[String]): StreamDescription.Builder = {
    value.fold(self) { v =>
      self.lastEvaluatedShardId(v)
    }
  }

}

final class StreamDescriptionOps(val self: StreamDescription) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def streamArnAsScala: Option[String] = Option(self.streamArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def streamLabelAsScala: Option[String] = Option(self.streamLabel)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def streamStatusAsScala: Option[StreamStatus] = Option(self.streamStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def streamViewTypeAsScala: Option[StreamViewType] = Option(self.streamViewType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def creationRequestDateTimeAsScala: Option[java.time.Instant] = Option(self.creationRequestDateTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tableNameAsScala: Option[String] = Option(self.tableName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keySchemaAsScala: Option[Seq[KeySchemaElement]] = Option(self.keySchema).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def shardsAsScala: Option[Seq[Shard]] = Option(self.shards).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastEvaluatedShardIdAsScala: Option[String] = Option(self.lastEvaluatedShardId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStreamDescriptionOps {

  implicit def toStreamDescriptionBuilderOps(v: StreamDescription.Builder): StreamDescriptionBuilderOps =
    new StreamDescriptionBuilderOps(v)

  implicit def toStreamDescriptionOps(v: StreamDescription): StreamDescriptionOps = new StreamDescriptionOps(v)

}
