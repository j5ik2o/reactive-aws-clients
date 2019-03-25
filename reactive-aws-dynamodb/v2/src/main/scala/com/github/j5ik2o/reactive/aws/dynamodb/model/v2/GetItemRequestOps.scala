package com.github.j5ik2o.reactive.aws.dynamodb.model.v2


import com.github.j5ik2o.reactive.aws.dynamodb.model.{ GetItemRequest => ScalaGetItemRequest, _ }
import software.amazon.awssdk.services.dynamodb.model.{ GetItemRequest => JavaGetItemRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetItemRequestOps {

  implicit class ScalaGetItemRequestOps(val self: ScalaGetItemRequest) extends AnyVal {

    def toJava: JavaGetItemRequest = {
      val result = JavaGetItemRequest.builder()
                                                    self.tableName.filter(_.nonEmpty).foreach(v => result.tableName(v)) // String, case String
                            self.key.filter(_.nonEmpty).foreach{ v => import scala.collection.JavaConverters._, AttributeValueOps._; result.key(v.mapValues(_.toJava).asJava) } // Map[String, AttributeValue], case Map[_], UserDefined
                        self.attributesToGet.filter(_.nonEmpty).foreach{ v => import scala.collection.JavaConverters._; result.attributesToGet(v.asJava) } // Seq[String], case Seq[_], Defined
                    self.consistentRead.map(_.booleanValue).foreach(v => result.consistentRead(v)) // Boolean, case Boolean
                    self.returnConsumedCapacity.foreach{ v => import ReturnConsumedCapacityOps._; result.returnConsumedCapacity(v.toJava) } // String, case Other
                    self.projectionExpression.filter(_.nonEmpty).foreach(v => result.projectionExpression(v)) // String, case String
                        self.expressionAttributeNames.filter(_.nonEmpty).map(_.mapValues(_.asInstanceOf[java.lang.String])).foreach{ v => import scala.collection.JavaConverters._; result.expressionAttributeNames(v.asJava) } // Map[String, String], case Map[_]

      result.build()
    }

  }

}