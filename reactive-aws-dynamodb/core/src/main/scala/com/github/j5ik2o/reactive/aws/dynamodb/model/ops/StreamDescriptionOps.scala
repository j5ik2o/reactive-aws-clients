// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class StreamDescriptionBuilderOps(val self: StreamDescription.Builder) extends AnyVal {

  final def streamArnAsScala(value: Option[String]): StreamDescription.Builder = {
    value.fold(self) { v =>
      self.streamArn(v)
    }
  }

  final def streamLabelAsScala(value: Option[String]): StreamDescription.Builder = {
    value.fold(self) { v =>
      self.streamLabel(v)
    }
  }

  final def streamStatusAsScala(value: Option[StreamStatus]): StreamDescription.Builder = {
    value.fold(self) { v =>
      self.streamStatus(v)
    }
  }

  final def streamViewTypeAsScala(value: Option[StreamViewType]): StreamDescription.Builder = {
    value.fold(self) { v =>
      self.streamViewType(v)
    }
  }

  final def creationRequestDateTimeAsScala(value: Option[java.time.Instant]): StreamDescription.Builder = {
    value.fold(self) { v =>
      self.creationRequestDateTime(v)
    }
  }

  final def tableNameAsScala(value: Option[String]): StreamDescription.Builder = {
    value.fold(self) { v =>
      self.tableName(v)
    }
  }

  final def keySchemaAsScala(value: Option[Seq[KeySchemaElement]]): StreamDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.keySchema(v.asJava)
    }
  }

  final def shardsAsScala(value: Option[Seq[Shard]]): StreamDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.shards(v.asJava)
    }
  }

  final def lastEvaluatedShardIdAsScala(value: Option[String]): StreamDescription.Builder = {
    value.fold(self) { v =>
      self.lastEvaluatedShardId(v)
    }
  }

}

final class StreamDescriptionOps(val self: StreamDescription) extends AnyVal {

  final def streamArnAsScala: Option[String] = Option(self.streamArn)

  final def streamLabelAsScala: Option[String] = Option(self.streamLabel)

  final def streamStatusAsScala: Option[StreamStatus] = Option(self.streamStatus)

  final def streamViewTypeAsScala: Option[StreamViewType] = Option(self.streamViewType)

  final def creationRequestDateTimeAsScala: Option[java.time.Instant] = Option(self.creationRequestDateTime)

  final def tableNameAsScala: Option[String] = Option(self.tableName)

  final def keySchemaAsScala: Option[Seq[KeySchemaElement]] = Option(self.keySchema).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def shardsAsScala: Option[Seq[Shard]] = Option(self.shards).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def lastEvaluatedShardIdAsScala: Option[String] = Option(self.lastEvaluatedShardId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStreamDescriptionOps {

  implicit def toStreamDescriptionBuilderOps(v: StreamDescription.Builder): StreamDescriptionBuilderOps =
    new StreamDescriptionBuilderOps(v)

  implicit def toStreamDescriptionOps(v: StreamDescription): StreamDescriptionOps = new StreamDescriptionOps(v)

}
