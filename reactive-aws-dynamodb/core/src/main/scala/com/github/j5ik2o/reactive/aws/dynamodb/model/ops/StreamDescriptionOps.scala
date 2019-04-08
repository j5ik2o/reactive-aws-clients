// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class StreamDescriptionBuilderOps(val self: StreamDescription.Builder) extends AnyVal {

  final def streamArnAsScala(value: Option[String]): StreamDescription.Builder = {
    value.fold(self) { v =>
      self.streamArn(v)
    }
  } // String

  final def streamLabelAsScala(value: Option[String]): StreamDescription.Builder = {
    value.fold(self) { v =>
      self.streamLabel(v)
    }
  } // String

  final def streamStatusAsScala(value: Option[StreamStatus]): StreamDescription.Builder = {
    value.fold(self) { v =>
      self.streamStatus(v)
    }
  } // String

  final def streamViewTypeAsScala(value: Option[StreamViewType]): StreamDescription.Builder = {
    value.fold(self) { v =>
      self.streamViewType(v)
    }
  } // String

  final def creationRequestDateTimeAsScala(value: Option[java.time.Instant]): StreamDescription.Builder = {
    value.fold(self) { v =>
      self.creationRequestDateTime(v)
    }
  } // Instant

  final def tableNameAsScala(value: Option[String]): StreamDescription.Builder = {
    value.fold(self) { v =>
      self.tableName(v)
    }
  } // String

  final def keySchemaAsScala(value: Option[Seq[KeySchemaElement]]): StreamDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.keySchema(v.asJava)
    } // Seq[KeySchemaElement]
  }

  final def shardsAsScala(value: Option[Seq[Shard]]): StreamDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.shards(v.asJava)
    } // Seq[Shard]
  }

  final def lastEvaluatedShardIdAsScala(value: Option[String]): StreamDescription.Builder = {
    value.fold(self) { v =>
      self.lastEvaluatedShardId(v)
    }
  } // String

}

final class StreamDescriptionOps(val self: StreamDescription) extends AnyVal {

  final def streamArnAsScala: Option[String] = Option(self.streamArn) // String

  final def streamLabelAsScala: Option[String] = Option(self.streamLabel) // String

  final def streamStatusAsScala: Option[StreamStatus] = Option(self.streamStatus) // String

  final def streamViewTypeAsScala: Option[StreamViewType] = Option(self.streamViewType) // String

  final def creationRequestDateTimeAsScala: Option[java.time.Instant] = Option(self.creationRequestDateTime) // Instant

  final def tableNameAsScala: Option[String] = Option(self.tableName) // String

  final def keySchemaAsScala: Option[Seq[KeySchemaElement]] = Option(self.keySchema).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[KeySchemaElement]

  final def shardsAsScala: Option[Seq[Shard]] = Option(self.shards).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Shard]

  final def lastEvaluatedShardIdAsScala: Option[String] = Option(self.lastEvaluatedShardId) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStreamDescriptionOps {

  implicit def toStreamDescriptionBuilderOps(v: StreamDescription.Builder): StreamDescriptionBuilderOps =
    new StreamDescriptionBuilderOps(v)

  implicit def toStreamDescriptionOps(v: StreamDescription): StreamDescriptionOps = new StreamDescriptionOps(v)

}
