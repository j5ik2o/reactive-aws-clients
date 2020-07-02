// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class BatchGetItemResponseBuilderOps(val self: BatchGetItemResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def responsesAsScala(
      value: Option[Map[String, Seq[Map[String, AttributeValue]]]]
  ): BatchGetItemResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._;
      self.responses(v.view.map { case (k, v) => (k, v.map(_.asJava).asJava) }.toMap.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def unprocessedKeysAsScala(value: Option[Map[String, KeysAndAttributes]]): BatchGetItemResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.unprocessedKeys(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def consumedCapacityAsScala(value: Option[Seq[ConsumedCapacity]]): BatchGetItemResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.consumedCapacity(v.asJava)
    }
  }

}

final class BatchGetItemResponseOps(val self: BatchGetItemResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def responsesAsScala: Option[Map[String, Seq[Map[String, AttributeValue]]]] =
    Option(self.responses).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._;
      v.asScala.toMap.view.map { case (k, v) => (k, v.asScala.map(_.asScala.toMap)) }.toMap
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def unprocessedKeysAsScala: Option[Map[String, KeysAndAttributes]] =
    Option(self.unprocessedKeys).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def consumedCapacityAsScala: Option[Seq[ConsumedCapacity]] =
    Option(self.consumedCapacity).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToBatchGetItemResponseOps {

  implicit def toBatchGetItemResponseBuilderOps(v: BatchGetItemResponse.Builder): BatchGetItemResponseBuilderOps =
    new BatchGetItemResponseBuilderOps(v)

  implicit def toBatchGetItemResponseOps(v: BatchGetItemResponse): BatchGetItemResponseOps =
    new BatchGetItemResponseOps(v)

}
