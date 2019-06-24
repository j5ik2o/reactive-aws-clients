// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class QueryResponseBuilderOps(val self: QueryResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def itemsAsScala(value: Option[Seq[Map[String, AttributeValue]]]): QueryResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.items(v.map(_.asJava).asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def countAsScala(value: Option[Int]): QueryResponse.Builder = {
    value.fold(self) { v =>
      self.count(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def scannedCountAsScala(value: Option[Int]): QueryResponse.Builder = {
    value.fold(self) { v =>
      self.scannedCount(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastEvaluatedKeyAsScala(value: Option[Map[String, AttributeValue]]): QueryResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.lastEvaluatedKey(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def consumedCapacityAsScala(value: Option[ConsumedCapacity]): QueryResponse.Builder = {
    value.fold(self) { v =>
      self.consumedCapacity(v)
    }
  }

}

final class QueryResponseOps(val self: QueryResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def itemsAsScala: Option[Seq[Map[String, AttributeValue]]] = Option(self.items).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.map(_.asScala.toMap)
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def countAsScala: Option[Int] = Option(self.count)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def scannedCountAsScala: Option[Int] = Option(self.scannedCount)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastEvaluatedKeyAsScala: Option[Map[String, AttributeValue]] = Option(self.lastEvaluatedKey).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def consumedCapacityAsScala: Option[ConsumedCapacity] = Option(self.consumedCapacity)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToQueryResponseOps {

  implicit def toQueryResponseBuilderOps(v: QueryResponse.Builder): QueryResponseBuilderOps =
    new QueryResponseBuilderOps(v)

  implicit def toQueryResponseOps(v: QueryResponse): QueryResponseOps = new QueryResponseOps(v)

}
