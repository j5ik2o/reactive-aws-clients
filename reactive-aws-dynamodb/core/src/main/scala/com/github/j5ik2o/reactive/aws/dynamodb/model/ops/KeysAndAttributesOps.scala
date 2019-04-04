// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class KeysAndAttributesBuilderOps(val self: KeysAndAttributes.Builder) extends AnyVal {

  final def withKeysAsScala(value: Option[Seq[Map[String, AttributeValue]]]): KeysAndAttributes.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.keys(v.map(_.asJava).asJava)
    } // Seq[Map[String, AttributeValue]]
  }

  final def withAttributesToGetAsScala(value: Option[Seq[String]]): KeysAndAttributes.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.attributesToGet(v.asJava)
    } // Seq[String]
  }

  final def withConsistentReadAsScala(value: Option[Boolean]): KeysAndAttributes.Builder = {
    value.fold(self) { v =>
      self.consistentRead(v)
    }
  } // Boolean

  final def withProjectionExpressionAsScala(value: Option[String]): KeysAndAttributes.Builder = {
    value.fold(self) { v =>
      self.projectionExpression(v)
    }
  } // String

  final def withExpressionAttributeNamesAsScala(value: Option[Map[String, String]]): KeysAndAttributes.Builder = {
    value.filter(_.nonEmpty).map(_.mapValues(_.asInstanceOf[java.lang.String])).fold(self) { v =>
      import scala.collection.JavaConverters._; self.expressionAttributeNames(v.asJava)
    } // Map[String, String]
  }

}

final class KeysAndAttributesOps(val self: KeysAndAttributes) extends AnyVal {

  final def keysAsScala: Option[Seq[Map[String, AttributeValue]]] = Option(self.keys).map { v =>
    import scala.collection.JavaConverters._; v.asScala.map(_.asScala.toMap)
  } // Seq[Map[String, AttributeValue]]

  final def attributesToGetAsScala: Option[Seq[String]] = Option(self.attributesToGet).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def consistentReadAsScala: Option[Boolean] = Option(self.consistentRead) // Boolean

  final def projectionExpressionAsScala: Option[String] = Option(self.projectionExpression) // String

  final def expressionAttributeNamesAsScala: Option[Map[String, String]] = Option(self.expressionAttributeNames).map {
    v =>
      import scala.collection.JavaConverters._; v.asScala.toMap
  } // Map[String, String]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToKeysAndAttributesOps {

  implicit def toKeysAndAttributesBuilderOps(v: KeysAndAttributes.Builder): KeysAndAttributesBuilderOps =
    new KeysAndAttributesBuilderOps(v)

  implicit def toKeysAndAttributesOps(v: KeysAndAttributes): KeysAndAttributesOps = new KeysAndAttributesOps(v)

}
