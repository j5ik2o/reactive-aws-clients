// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class KeysAndAttributesBuilderOps(val self: KeysAndAttributes.Builder) extends AnyVal {

  final def keysAsScala(value: Option[Seq[Map[String, AttributeValue]]]): KeysAndAttributes.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.keys(v.map(_.asJava).asJava)
    }
  }

  final def attributesToGetAsScala(value: Option[Seq[String]]): KeysAndAttributes.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.attributesToGet(v.asJava)
    }
  }

  final def consistentReadAsScala(value: Option[Boolean]): KeysAndAttributes.Builder = {
    value.fold(self) { v =>
      self.consistentRead(v)
    }
  }

  final def projectionExpressionAsScala(value: Option[String]): KeysAndAttributes.Builder = {
    value.fold(self) { v =>
      self.projectionExpression(v)
    }
  }

  final def expressionAttributeNamesAsScala(value: Option[Map[String, String]]): KeysAndAttributes.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.expressionAttributeNames(v.asJava)
    }
  }

}

final class KeysAndAttributesOps(val self: KeysAndAttributes) extends AnyVal {

  final def keysAsScala: Option[Seq[Map[String, AttributeValue]]] = Option(self.keys).map { v =>
    import scala.collection.JavaConverters._; v.asScala.map(_.asScala.toMap)
  }

  final def attributesToGetAsScala: Option[Seq[String]] = Option(self.attributesToGet).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def consistentReadAsScala: Option[Boolean] = Option(self.consistentRead)

  final def projectionExpressionAsScala: Option[String] = Option(self.projectionExpression)

  final def expressionAttributeNamesAsScala: Option[Map[String, String]] = Option(self.expressionAttributeNames).map {
    v =>
      import scala.collection.JavaConverters._; v.asScala.toMap
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToKeysAndAttributesOps {

  implicit def toKeysAndAttributesBuilderOps(v: KeysAndAttributes.Builder): KeysAndAttributesBuilderOps =
    new KeysAndAttributesBuilderOps(v)

  implicit def toKeysAndAttributesOps(v: KeysAndAttributes): KeysAndAttributesOps = new KeysAndAttributesOps(v)

}
