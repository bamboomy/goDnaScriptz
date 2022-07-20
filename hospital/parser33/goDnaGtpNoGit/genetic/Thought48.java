package genetic;
import java.util.ArrayList;
class Thought48 extends Thought{
private static ArrayList<Thought48> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 385.63662308318374;
private double fd1 = 619.532605826995;
private Thought fo0 = null;
private Thought fo1 = null;
Thought48 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought48 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought48 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought48 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought48 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought48 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought48 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought48 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
public static Thought48 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought48 instance = new Thought48 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought48 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought48 instance = new Thought48 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought48 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought48 instance = new Thought48 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought48 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought48 instance = new Thought48 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought48 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought48 instance = new Thought48 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought48 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought48 instance = new Thought48 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought48 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought48 instance = new Thought48 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought48 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought48 instance = new Thought48 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
void m1() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
        fd0 *= -1;
    fd1 = fd0 + fd1;
    boolean lb0 = false;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    lb0 = !fb0;
    if (fb1) {
if(fo1 != null){
          lb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
if(fo1 != null){
      ab2 = fo1.m2(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    fd0 *= -1;
    Thought lo0 = Thought351.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
    fd1 = fd0 + fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    ab1 = !ab2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m2();
}
    boolean lb1 = true;
    Output.points[0][3] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb1, ab1, ab2);
}
    boolean lb2 = false;
    ab2 = ab3 && ab4;
        fd0 *= -1;
    fb0 = !fb1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought377.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
    fd1 = ad1 + ad2;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
}
    ad3 = ad4 - fd0;
    double ld2 = 206.89023015515903;
    fb0 = fd0 > fd1;
    ld2 = ad1 - ad2;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(ad3, ad4, fd0, fd1);
}
    ld2 = ad1 + ad2;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m3();
}
if(fo1 != null){
      ad1 = fo1.m3(ab1, ab2, ab3, ab4);
}
    fb0 = ad2 < ad3;
    Output.points[0][4] += ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
    fb0 = fb1 || lb0;
    ab1 = ab2 || ab3;
    boolean lb1 = false;
    boolean lb2 = true;
    Thought lo3 = Thought365.getInstance(fo0, fo1, fo0, fo1);
    ad1 = ad2 - ad3;
    ad4 *= -1;
    fd0 = fd1 - ad1;
    double ld4 = 623.0691337294791;
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
    Output.points[0][5] += ld4;
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld4, ad1, ad2);
}
if(fo1 != null){
      fo1.m1();
}
    ad3 = ad4 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    fd1 = fd0 - fd1;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && lb0;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      ao1.m1();
}
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb0, fb0);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(ao2 != null){
      ao2.m3(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    fb0 = ad4 < fd0;
    fb1 = fd1 > ad1;
if(ao3 != null){
      ad2 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ad3 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1);
}
    fb0 = !fb1;
    fb0 = fb1 && fb0;
    fb1 = !fb0;
    fb1 = fb0 && fb1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    ab4 = fb0 && fb1;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ao3.m3(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    ab1 = fd1 > fd0;
    boolean lb0 = false;
    Output.points[0][6] += fd1;
    Thought lo1 = Thought119.getInstance(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
    fb0 = fd0 > fd1;
    Output.points[0][7] -= fd0;
if(ao4 != null){
          fd1 = ao4.m3(fo0, fo1, ao1, ao2);
}
    Thought lo2 = Thought325.getInstance(fd0, fd1, fd0, fd1);
    fb1 = lb0 || ab1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
    boolean lb0 = false;
    fd0 = fd1 + ad1;
    boolean lb1 = true;
    boolean lb2 = true;
if(fo1 != null){
      fo1.m2();
}
if(ao1 != null){
      ao1.m3(lb0, lb1, lb2, ab1);
}
    Output.points[0][8] -= ad2;
    Output.points[1][0] += ad3;
    Thought lo3 = Thought84.getInstance(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1, fb1, lb0, lb1, lb2);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd0 < fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    fb1 = !fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb0 = !fb1;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1);
}
    fb1 = !fb0;
        fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought8.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    boolean lb1 = true;

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    Thought lo0 = Thought279.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
    fb0 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = fd1 < fd0;
    ab1 = !ab2;
    Output.points[1][1] -= fd1;
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1);
}
    ab3 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
        ab4 = fd0 > fd1;

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
if(fo0 != null){
      fo0.m3();
}
    ad2 = ad3 - ad4;
if(fo0 != null){
          fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    fb1 = ad3 < ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    Output.points[1][2] += ad3;
    ad4 = fd0 - fd1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    if (fb1) {
if(fo1 != null){
          fo1.m2(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
        for(int i0=0; i0<10; i0++){
if(fo0 != null){
              ad3 = fo0.m3();
}
}}
Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    boolean lb0 = false;
    ab3 = fd1 < ad1;
    ab4 = fb0 || fb1;
    lb0 = ad2 > ad3;
    ad4 *= -1;
    fd0 = fd1 - ad1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    double ld1 = 525.50824069131;
    fd0 = fd1 - ld1;

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    fb1 = fd1 < fd0;
    Thought lo0 = Thought350.getInstance(ao1, ao2, ao3, ao4);
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    boolean lb1 = true;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    boolean lb2 = true;
    if (lb1) {
        Thought lo3 = Thought107.getInstance(lb2, fb0, fb1, lb1);
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, lb2, fb0, fb1, lb1);
}
if(ao2 != null){
          lb2 = ao2.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb1, lb2);
}
        fb0 = fd1 < fd0;
        Thought lo4 = Thought293.getInstance(ao3, ao4, fo0, fo1, fb1, lb1, lb2, fb0);
        Output.points[1][3] += fd1;
if(ao1 != null){
          ao1.m1(ao2, ao3, ao4, fo0);
}
        boolean lb5 = true;
        Thought lo6 = Thought14.getInstance(fd0, fd1, fd0, fd1);
        fb0 = fd0 < fd1;
        boolean lb7 = false;
if(fo1 != null){
          fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
}
        fb0 = fd0 > fd1;
        fd0 = fd1 + fd0;
        fb1 = lb5 && lb7;
        lb1 = lb2 && fb0;
        boolean lb8 = false;
if(fo0 != null){
          fb0 = fo0.m2();
}
}
Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m3(fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ad2 = ao3.m3(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Output.points[1][4] -= ad1;
    fb1 = ad2 < ad3;
    fb0 = ad4 > fd0;
    fb1 = !fb0;
    boolean lb0 = true;
    fb0 = !fb1;
    lb0 = fd1 > ad1;
if(ao2 != null){
      ao2.m2(ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = fd1 < ad1;
if(ao3 != null){
      lb0 = ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, lb0, fb0);
}
    ad2 = ad3 - ad4;

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(ao2 != null){
      lb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
    Thought lo1 = Thought8.getInstance(fd0, fd1, fd0, fd1);
    ab1 = fd0 > fd1;
    Output.points[1][5] += fd0;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    ab2 = ab3 || ab4;
    boolean lb2 = true;
    double ld3 = 831.6315983242607;
    fd0 = fd1 + ld3;

Thought.STACK_COUNTER++;
return ab4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(lb0, ab1, ab2, ab3);
}
if(fo1 != null){
      ad2 = fo1.m3(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb0);
}
    ad1 = ad2 - ad3;
    ab1 = ad4 > fd0;
    double ld1 = 512.8386561318437;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, ad1, ab2, ab3, ab4, fb0);
}
    Thought lo2 = Thought111.getInstance(ao1, ao2, ao3, ao4, fb1, lb0, ab1, ab2);
    ad2 *= -1;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ad3 = ao4.m3(ad4, fd0, fd1, ld1);
}
    boolean lb3 = true;
    ab2 = !ab3;
    double ld4 = 483.1979883210565;
    ld4 = ad1 + ad2;
    ab4 = ad3 > ad4;
    fd0 = fd1 + ld1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld4, ad1, ad2, ad3);
}
if(fo0 != null){
      fb0 = fo0.m2();
}
    Thought lo5 = Thought351.getInstance(fb1, lb0, lb3, ab1);
    ad4 *= -1;
    fd0 = fd1 - ld1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld4, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    boolean lb6 = true;
if(ao1 != null){
      fo1 = ao1.m4(ad4, fd0, fd1, ld1, fb0, fb1, lb0, lb3);
}

Thought.STACK_COUNTER++;
return lb6;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (fb1) {
        fd1 = fd0 + fd1;
        fb0 = fd0 > fd1;
        fb1 = fb0 && fb1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
        fd0 *= -1;
        fd1 = fd0 + fd1;
        boolean lb0 = false;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
        double ld1 = 880.3620025800383;
}
Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    ab2 = ab3 && ab4;
if(fo1 != null){
      fd1 = fo1.m3();
}
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, ab1, ab2);
}
    ab3 = fd1 < fd0;
    ab4 = fd1 < fd0;
    Thought lo0 = Thought356.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
    fd1 *= -1;
    Output.points[1][6] -= fd0;
    ab3 = ab4 && fb0;
    Thought lo1 = Thought281.getInstance(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    Thought lo2 = Thought396.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    fb0 = fb1 && lb0;
    boolean lb1 = true;
    lb1 = fb0 || fb1;
    Thought lo2 = Thought397.getInstance(ad1, ad2, ad3, ad4, lb0, lb1, fb0, fb1);
    fd0 *= -1;
    lb0 = fd1 < ad1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb3 = true;
    lb1 = ad3 > ad4;
    double ld4 = 727.8350090012837;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld4);
}
    lb3 = fb0 && fb1;
    ad1 = ad2 + ad3;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld4);
}

Thought.STACK_COUNTER++;
return ad1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[1][7] -= ad1;
    ab2 = ab3 && ab4;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = ad2 < ad3;
if(fo0 != null){
      fo1 = fo0.m4(fb1, ab1, ab2, ab3);
}
    Thought lo0 = Thought376.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab4, fb0, fb1, ab1);
if(fo1 != null){
      ab2 = fo1.m2(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    fd1 = ad1 - ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ad1);
}
    Output.points[1][8] += ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    Thought lo1 = Thought86.getInstance();
if(fo1 != null){
      fo1.m3(fb0, fb1, ab1, ab2);
}
        ab3 = ad1 > ad2;
    Thought lo2 = Thought246.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
if(fo0 != null){
      fo0.m3(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + ad1;
    Output.points[2][0] -= ad2;
    ad3 = ad4 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
        boolean lb3 = true;
    for(int i0=0; i0<10; i0++){
}
Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fb1 = ao1.m2(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    Output.points[2][1] -= fd0;
    double ld0 = 726.5147919176013;
    fb0 = fb1 || fb0;
if(ao2 != null){
      ao2.m2();
}
if(ao3 != null){
      fd0 = ao3.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < ld0;
    boolean lb1 = false;
    double ld2 = 91.33048961245778;
if(ao4 != null){
      lb1 = ao4.m2(fo0, fo1, ao1, ao2, ld2, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(ld2, fd0, fd1, ld0, fb1, lb1, fb0, fb1);
}
if(fo0 != null){
      ld2 = fo0.m3(fo1, ao1, ao2, ao3, lb1, fb0, fb1, lb1);
}
    fd0 *= -1;
    boolean lb3 = true;
    lb3 = fb0 && fb1;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2);
}
    Output.points[2][2] -= ld0;
    lb1 = lb3 || fb0;
if(ao3 != null){
      ao3.m3(ld2, fd0, fd1, ld0);
}
    ld2 *= -1;
    fb1 = lb1 || lb3;
    Output.points[2][3] += fd0;
    fb0 = fb1 && lb1;
    boolean lb4 = true;

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad1 < ad2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    Output.points[2][4] -= ad1;
    boolean lb0 = false;
    boolean lb1 = false;
    double ld2 = 962.4214585450751;
    Thought lo3 = Thought349.getInstance(lb0, lb1, fb0, fb1);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, lb0, lb1, fb0, fb1);
}
    boolean lb4 = true;
    lb0 = !lb1;
    double ld5 = 224.03874744552155;
    lb4 = fb0 && fb1;
    lb0 = lb1 || lb4;
if(fo0 != null){
      ao4 = fo0.m4(ad4, fd0, fd1, ld2, fb0, fb1, lb0, lb1);
}
    Output.points[2][5] -= ld5;
    Thought lo6 = Thought274.getInstance(fo1, ao1, ao2, ao3, lb4, fb0, fb1, lb0);
    double ld7 = 361.19363987121113;
    lb1 = ld7 < ad1;
if(ao4 != null){
      ad2 = ao4.m3(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      lb4 = ao3.m2(ad3, ad4, fd0, fd1);
}
    ld2 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld5, ld7, ad1, ad2);
}
if(ao4 != null){
      fb0 = ao4.m2();
}
    double ld8 = 407.63329778284117;
if(fo0 != null){
      fo0.m1(fb1, lb0, lb1, lb4);
}
    Thought lo9 = Thought4.getInstance(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, fb0, fb1, lb0, lb1);
    for(int i0=0; i0<10; i0++){
}
Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 915.8050958144933;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ab1 = ao2.m2(ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
          fd0 = ao3.m3(ao4, fo0, fo1, ao1, fb1, ab1, ab2, ab3);
}
        ab4 = fd1 < ld0;
if(ao2 != null){
          fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
          ao1.m1(fd1, ld0, fd0, fd1);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0);
}
        fb0 = fd0 > fd1;
if(ao3 != null){
          ao2 = ao3.m4();
}
if(ao4 != null){
          ld0 = ao4.m3(fb1, ab1, ab2, ab3);
}
        Thought lo1 = Thought223.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0, ab4, fb0, fb1, ab1);
        fd1 = ld0 + fd0;
        fd1 = ld0 - fd0;
        ab2 = ab3 || ab4;
if(ao3 != null){
          ao3.m3(fd1, ld0, fd0, fd1, fb0, fb1, ab1, ab2);
}
        Thought lo2 = Thought58.getInstance(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
        Thought lo3 = Thought62.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
          fo1.m2(ld0, fd0, fd1, ld0);
}
        boolean lb4 = false;
        Output.points[2][6] -= fd0;
        Thought lo5 = Thought320.getInstance(ao1, ao2, ao3, ao4, fd1, ld0, fd0, fd1);
        ld0 *= -1;
if(fo1 != null){
          fo0 = fo1.m4();
}
        lb4 = fd0 < fd1;
        double ld6 = 548.1305134604178;
}
Thought.STACK_COUNTER++;
return ld0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
if(ao1 != null){
      fd0 = ao1.m3(ab2, ab3, ab4, fb0);
}
    fb1 = fd1 < ad1;
    Output.points[2][7] += ad2;
    ab1 = ad3 > ad4;
    boolean lb0 = false;
    ab1 = fd0 < fd1;
    double ld1 = 597.7929876805271;
    ld1 = ad1 - ad2;
    boolean lb2 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Output.points[2][8] += ld1;
    boolean lb3 = false;
    boolean lb4 = false;
if(ao2 != null){
      ao2.m1(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    lb0 = !lb2;
    fd0 = fd1 - ld1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb3, lb4, ab1, ab2);
}
    boolean lb5 = false;
    boolean lb6 = true;
    ab1 = ab2 || ab3;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    ad1 *= -1;
    ab4 = fb0 && fb1;
if(ao4 != null){
      ao3 = ao4.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, ld1, ad1, ad2, ad3);
}
if(ao4 != null){
      ad4 = ao4.m3();
}

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought47.getInstance(fb0, fb1, fb0, fb1);
    Output.points[3][0] -= fd0;
    fb0 = fb1 || fb0;
    fd1 = fd0 - fd1;
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
    fd0 *= -1;
    fb1 = fb0 || fb1;
    fd1 = fd0 + fd1;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    double ld1 = 906.4899092501058;
    double ld2 = 331.11388593915814;
if(fo1 != null){
      fo0 = fo1.m4(ld1, ld2, fd0, fd1, fb0, fb1, fb0, fb1);
}

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 + fd0;
    boolean lb0 = false;
    ab4 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb1 = true;
    Thought lo2 = Thought334.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, lb1);
}
    ab1 = fd0 > fd1;
    if (ab2) {
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
        lb0 = lb1 && ab1;
        boolean lb3 = false;
if(fo0 != null){
          fo0.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb3, lb0, lb1);
}
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0);
}
        Output.points[3][1] += fd1;
if(fo1 != null){
          fo1.m1(fd0, fd1, fd0, fd1);
}
        double ld4 = 801.8650660588919;
        ab1 = ld4 > fd0;
        fd1 = ld4 + fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld4, fd0, fd1);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        ab2 = ld4 > fd0;
if(fo1 != null){
          fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
}
Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo0.m3(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    if (fb0) {
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fo1.m3(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
        Thought lo0 = Thought145.getInstance();
if(fo1 != null){
          fo1.m2(fb0, fb1, fb0, fb1);
}
        Thought lo1 = Thought398.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
        double ld2 = 744.3386781058879;
if(fo0 != null){
          fo0.m3(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
        fb0 = fd1 < ld2;
        double ld3 = 321.4298518686015;
}
Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
    boolean lb0 = false;
    ab4 = fb0 && fb1;
    lb0 = ab1 && ab2;
    ab3 = ab4 || fb0;
    Thought lo1 = Thought74.getInstance(fo0, fo1, fo0, fo1, fb1, lb0, ab1, ab2);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fd0 = fo0.m3();
}
    Output.points[3][2] += fd1;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
if(ao1 != null){
      fb0 = ao1.m2(fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    fd0 = fd1 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    fb0 = !fb1;
    double ld0 = 941.751977634182;
    Thought lo1 = Thought121.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);

Thought.STACK_COUNTER++;
return ao1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
    Output.points[3][3] += ad1;
    fb0 = ad2 > ad3;
    ad4 = fd0 - fd1;
    fb1 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ad1 = ao2.m3(ad2, ad3, ad4, fd0);
}
    fb1 = fb0 || fb1;
    double ld0 = 467.62505873376176;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ad1);
}
    fb0 = fb1 && fb0;
    ad2 = ad3 + ad4;
    fb1 = fd0 > fd1;
if(ao2 != null){
      ld0 = ao2.m3();
}
    fb0 = ad1 > ad2;
    fb1 = !fb0;
if(ao3 != null){
      ao3.m2(fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ad3 = ao4.m3(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    ad1 = ad2 - ad3;
    Thought lo1 = Thought32.getInstance(ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
    Thought lo2 = Thought289.getInstance(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
    fb1 = ld0 < ad1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    boolean lb3 = true;
if(ao1 != null){
      ao1.m3();
}

Thought.STACK_COUNTER++;
return ao2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought102.getInstance(ab1, ab2, ab3, ab4);
    Output.points[3][4] += fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    Thought lo1 = Thought150.getInstance(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
    ab1 = ab2 || ab3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
}
    boolean lb2 = true;
    ab1 = ab2 && ab3;
    fd1 *= -1;
    fd0 = fd1 - fd0;
        boolean lb3 = true;
    boolean lb4 = true;
    fd1 *= -1;
    fd0 = fd1 + fd0;
    ab2 = fd1 < fd0;
    ab3 = fd1 > fd0;
if(ao1 != null){
      ab4 = ao1.m2(ao2, ao3, ao4, fo0);
}
    fb0 = fb1 && lb2;
    boolean lb5 = true;
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
    if (lb3) {
if(ao2 != null){
          fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
        double ld6 = 346.2590693275205;
if(ao2 != null){
          ao1 = ao2.m4();
}
        lb4 = ld6 > fd0;
        lb5 = !ab1;
}
Thought.STACK_COUNTER++;
return ao3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 && ab4;
    fb0 = fb1 && ab1;
    double ld0 = 319.90781252860086;
    ld0 = ad1 + ad2;
    ad3 = ad4 + fd0;
    double ld1 = 4.409311424436613;
    fd0 = fd1 - ld0;
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
    fb1 = ld1 > ad1;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fd1 = ld0 + ld1;
    ad1 = ad2 - ad3;
if(ao3 != null){
      ad4 = ao3.m3(fd0, fd1, ld0, ld1, fb0, fb1, ab1, ab2);
}
if(ao4 != null){
      ad1 = ao4.m3(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    ab4 = ad2 > ad3;
    Thought lo2 = Thought155.getInstance(ad4, fd0, fd1, ld0);
    fb0 = !fb1;

Thought.STACK_COUNTER++;
return ao3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
void accept(String color) throws CountDownExc {
switch (color) {
case "e":
empty();
break;
case "own":
own();
break;
case "other":
other();
break;
default:
throw new RuntimeException("Illegal color!!!");
}
}
void empty() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        Output.points[3][5] -= fd1;
        fb0 = fb1 && fb0;
    boolean lb0 = true;
        fb0 = !fb1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    lb0 = fd1 < fd0;
if(fo0 != null){
      fd1 = fo0.m3();
}
    Thought lo1 = Thought110.getInstance(fb0, fb1, lb0, fb0);
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    Output.points[3][6] -= fd1;
if(fo0 != null){
      lb0 = fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    lb0 = fd0 > fd1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought53.getInstance(fo0, fo1, fo0, fo1);
    double ld1 = 408.3100066891666;
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld1);
}
    fb1 = fb0 || fb1;
        boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
    lb2 = fd1 < ld1;
if(fo1 != null){
      fo0 = fo1.m4();
}
        fb0 = !fb1;
    Thought lo3 = Thought304.getInstance(lb2, fb0, fb1, lb2);
    fb0 = fd0 > fd1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought389.getInstance(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    lb0 = !fb0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb1 = lb0 && fb0;
    fd0 = fd1 - fd0;
    fb1 = lb0 || fb0;
if(fo0 != null){
          fo1 = fo0.m4();
}
    fb1 = fd1 < fd0;
if(fo1 != null){
      fd1 = fo1.m3(lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 || fb1;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = lb0 && fb0;
    double ld2 = 361.47565378264807;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
}
