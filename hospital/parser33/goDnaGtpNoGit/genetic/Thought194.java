package genetic;
import java.util.ArrayList;
class Thought194 extends Thought{
private static ArrayList<Thought194> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 27.45471754663929;
private double fd1 = 63.931260216444926;
private Thought fo0 = null;
private Thought fo1 = null;
Thought194 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought194 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought194 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought194 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought194 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought194 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought194 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought194 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought194 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought194 instance = new Thought194 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought194 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought194 instance = new Thought194 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought194 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought194 instance = new Thought194 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought194 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought194 instance = new Thought194 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought194 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought194 instance = new Thought194 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought194 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought194 instance = new Thought194 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought194 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought194 instance = new Thought194 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought194 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought194 instance = new Thought194 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    fb0 = fd1 < fd0;
    fd1 *= -1;
    for(int i0=0; i0<10; i0++){
        fb1 = !fb0;
        }
    Thought lo0 = Thought315.getInstance();
    fb1 = !fb0;
if(fo0 != null){
      fo0.m1(fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    double ld1 = 518.818709718916;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fd1 = ld1 - fd0;
    fd1 *= -1;
    boolean lb2 = false;
    Output.points[0][2] += ld1;
    Thought lo3 = Thought116.getInstance(fo1, fo0, fo1, fo0);

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
    Output.points[0][3] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    ab2 = fd0 < fd1;
    Thought lo0 = Thought195.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    ab3 = ab4 && fb0;
if(fo1 != null){
      fb1 = fo1.m2();
}
if(fo0 != null){
      ab1 = fo0.m2(ab2, ab3, ab4, fb0);
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    fb0 = ad1 > ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, lb0, fb0, fb1);
}
    lb0 = !fb0;
    ad1 *= -1;
    Thought lo1 = Thought120.getInstance(ad2, ad3, ad4, fd0, fb1, lb0, fb0, fb1);
    fd1 = ad1 + ad2;
    boolean lb2 = false;
    ad3 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, lb2, fb0, fb1);
}
    boolean lb3 = true;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 + ad1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
        fd1 *= -1;
    Output.points[0][4] += ad1;
    ad2 = ad3 + ad4;
    lb0 = fd0 < fd1;
    boolean lb4 = false;
    double ld5 = 478.20571064053416;
    if (lb2) {
if(fo0 != null){
          lb3 = fo0.m2(fo1, fo0, fo1, fo0, ld5, ad1, ad2, ad3);
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
          fo1.m3();
}
    Thought lo0 = Thought92.getInstance(ab2, ab3, ab4, fb0);
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    ab3 = !ab4;
    boolean lb1 = false;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ab4 = fo0.m2(fd0, fd1, ad1, ad2);
}
    ad3 = ad4 - fd0;
    Thought lo2 = Thought250.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
    fb0 = ad4 < fd0;
    for(int i0=0; i0<10; i0++){
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
    boolean lb0 = false;
    fd1 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    Thought lo1 = Thought47.getInstance(lb0, fb0, fb1, lb0);
    fd0 = fd1 - fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
if(ao4 != null){
      ao4.m2(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    boolean lb2 = false;
    fd1 = fd0 - fd1;
    Output.points[0][5] += fd0;
    fd1 *= -1;
    fd0 *= -1;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, lb0, lb2, fb0, fb1);
}
    Thought lo3 = Thought66.getInstance(ao4, fo0, fo1, ao1);
    lb0 = fd0 > fd1;
    fd0 = fd1 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
    lb2 = fd1 > fd0;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    double ld0 = 125.54918552891057;
    fb0 = fd0 > fd1;
if(ao4 != null){
      ao4.m3(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld0, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(fo1 != null){
      ad1 = fo1.m3(ao1, ao2, ao3, ao4);
}
    ad2 = ad3 + ad4;
    fb1 = fb0 || fb1;
    fd0 = fd1 - ld0;
if(fo0 != null){
      fo0.m3(ad1, ad2, ad3, ad4);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    Output.points[0][6] -= fd1;
    fd0 = fd1 + fd0;
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      lb0 = ao1.m2();
}
    fd1 = fd0 + fd1;
    ab1 = fd0 < fd1;
    double ld1 = 117.0699859529227;
    double ld2 = 35.112570591471865;
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
    fb1 = !lb0;

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
    ad1 = ad2 - ad3;
    ab2 = ab3 || ab4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, fb0, fb1, ab1, ab2);
}
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
    fd1 *= -1;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ab4, fb0, fb1, ab1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    ab2 = ab3 && ab4;
    double ld0 = 360.44712499977413;
    fb0 = ld0 < ad1;
    fb1 = !ab1;
    ab2 = ab3 && ab4;
    fb0 = ad2 < ad3;
    fb1 = ad4 < fd0;
    ab1 = !ab2;

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
    Thought lo0 = Thought267.getInstance(fd0, fd1, fd0, fd1);
    fb0 = !fb1;
    Thought lo1 = Thought171.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    fb0 = fb1 && fb0;
    fb1 = fd0 > fd1;
    fb0 = fb1 || fb0;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = fb0 || fb1;
    Output.points[0][7] -= fd1;
    boolean lb2 = true;
    fd0 = fd1 + fd0;
    boolean lb3 = true;
    lb2 = lb3 || fb0;
    fd1 = fd0 + fd1;
    fb1 = fd0 > fd1;
    Output.points[0][8] -= fd0;

Thought.STACK_COUNTER++;
return lb2;
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
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    Thought lo0 = Thought1.getInstance(ab2, ab3, ab4, fb0);
    fb1 = ab1 && ab2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    Thought lo1 = Thought146.getInstance(fo1, fo0, fo1, fo0);
    fd1 = fd0 + fd1;
    ab3 = ab4 || fb0;
    boolean lb2 = true;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb0 = fd1 > fd0;
if(fo0 != null){
      fb1 = fo0.m2();
}
if(fo1 != null){
      fo1.m1(lb2, ab1, ab2, ab3);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb2);
}
    fd0 = fd1 + fd0;
    boolean lb3 = true;
    lb3 = ab1 || ab2;
    boolean lb4 = false;

Thought.STACK_COUNTER++;
return ab2;
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
if(fo1 != null){
      fb1 = fo1.m2(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fb0 = fd1 > ad1;
    Thought lo1 = Thought395.getInstance(ad2, ad3, ad4, fd0);
    fb1 = !lb0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo2 = Thought73.getInstance(fb0, fb1, lb0, fb0);
    ad4 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    Thought lo3 = Thought399.getInstance(fo1, fo0, fo1, fo0);
    lb0 = fb0 && fb1;
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo1.m3(ad4, fd0, fd1, ad1);
}
    double ld4 = 938.6503659035569;

Thought.STACK_COUNTER++;
return lb0;
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
    ab2 = ab3 || ab4;
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo0.m2(ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(ad2, ad3, ad4, fd0, lb0, ab1, ab2, ab3);
}
    fd1 = ad1 + ad2;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd0 < fd1;
    fb0 = fd0 < fd1;
    fd0 = fd1 + fd0;
    fb1 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    double ld0 = 425.38632746781144;
    Thought lo1 = Thought59.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
      fo1.m3(fd0, fd1, ld0, fd0);
}
    fd1 = ld0 - fd0;
    fb1 = !fb0;
    fb1 = fd1 < ld0;
    fd0 = fd1 - ld0;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ld0, fd0, fd1);
}
    ld0 = fd0 + fd1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fb0 = fo1.m2();
}
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m1(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought142.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
    Thought lo1 = Thought314.getInstance(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
    fb0 = ad3 < ad4;
    fd0 = fd1 - ad1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    Thought lo2 = Thought53.getInstance(fo1, ao1, ao2, ao3);
    fb1 = ad2 < ad3;
if(fo0 != null){
      ao4 = fo0.m4(ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fb1 = fo0.m2();
}
    double ld3 = 683.5347572519009;
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, fb0, fb1);
}
        boolean lb4 = false;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld3, ad1, lb4, fb0, fb1, lb4);
}
    double ld5 = 407.99206172843645;
if(ao1 != null){
      ao1.m1(ad1, ad2, ad3, ad4, fb0, fb1, lb4, fb0);
}
    fb1 = fd0 > fd1;
    ld3 = ld5 - ad1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, lb4, fb0, fb1, lb4);
}
    fb0 = fb1 && lb4;
    fb0 = fb1 && lb4;
    Thought lo6 = Thought159.getInstance(ao1, ao2, ao3, ao4);
    fb0 = !fb1;
if(fo0 != null){
      lb4 = fo0.m2(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, ld3, ld5, ad1, ad2);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd0 > fd1;
    ab2 = !ab3;
    boolean lb0 = false;
    fd0 = fd1 - fd0;
    ab3 = ab4 && fb0;
    fd1 *= -1;
if(ao1 != null){
      fd0 = ao1.m3();
}
    fd1 = fd0 - fd1;
    fb1 = fd0 > fd1;
    fd0 = fd1 + fd0;
    lb0 = fd1 < fd0;
    ab1 = fd1 > fd0;
    boolean lb1 = false;
    ab1 = !ab2;
    ab3 = ab4 && fb0;
    boolean lb2 = false;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao2.m3(fb0, fb1, lb0, lb1);
}
        Output.points[1][0] -= fd1;
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, lb2, ab1, ab2, ab3);
}
        ab4 = fb0 && fb1;
if(ao2 != null){
          ao2.m2(fd0, fd1, fd0, fd1, lb0, lb1, lb2, ab1);
}
}
Thought.STACK_COUNTER++;
return ab2;
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
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
    Thought lo0 = Thought302.getInstance(fo1, ao1, ao2, ao3);
    ab1 = ad1 < ad2;
if(ao4 != null){
      ad3 = ao4.m3(ad4, fd0, fd1, ad1);
}
    Thought lo1 = Thought223.getInstance(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
    ab2 = !ab3;
    double ld2 = 827.9826172076952;
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo0 != null){
      fd0 = fo0.m3(ab4, fb0, fb1, ab1);
}
    double ld3 = 33.66345370301618;
        fd0 *= -1;
    ab2 = ab3 || ab4;
        Output.points[1][1] += fd1;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, ld2, ld3, ad1, ad2, fb0, fb1, ab1, ab2);
}
    for(int i0=0; i0<10; i0++){
        Thought lo4 = Thought90.getInstance(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
}
        boolean lb5 = false;
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    fb1 = fb0 && fb1;
    boolean lb0 = false;
    fd1 = fd0 + fd1;
    Output.points[1][2] += fd0;
if(fo1 != null){
      lb0 = fo1.m2(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m2();
}
if(fo1 != null){
      fo1.m1(fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
    fb1 = fd0 < fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    lb0 = fb0 && fb1;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, lb1, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
    lb0 = !lb1;

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
    Output.points[1][3] -= fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
    ab4 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      lb0 = fo1.m2(fd1, fd0, fd1, fd0);
}
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    if (lb1) {
        fd1 *= -1;
        ab1 = ab2 || ab3;
        Output.points[1][4] -= fd0;
if(fo1 != null){
          fo0 = fo1.m4();
}
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought339.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb1 = fo1.m2(ad4, fd0, fd1, ad1);
}
    Thought lo1 = Thought219.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
    Output.points[1][5] += fd1;
if(fo0 != null){
      fb0 = fo0.m2();
}
    ad1 = ad2 + ad3;
    fb1 = ad4 < fd0;
    fb0 = fd1 < ad1;
    fb1 = !fb0;
    double ld2 = 583.5089722130646;
    ad1 = ad2 + ad3;

Thought.STACK_COUNTER++;
return ad4;
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
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
    fb1 = fd1 > ad1;
    ab1 = ab2 && ab3;
        ab4 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    ab3 = fd1 > ad1;

Thought.STACK_COUNTER++;
return ad2;
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
    fb1 = fd0 < fd1;
    fb0 = fd0 < fd1;
    fd0 = fd1 - fd0;
    double ld0 = 366.8681221159533;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fd0 *= -1;
    if (fb1) {
        fb0 = fb1 && fb0;
if(ao1 != null){
          ao1.m2(fd1, ld0, fd0, fd1);
}
        ld0 *= -1;
        Thought lo1 = Thought75.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0);
        fd1 = ld0 - fd0;
        fd1 *= -1;
        Thought lo2 = Thought110.getInstance();
        ld0 = fd0 + fd1;
        ld0 = fd0 + fd1;
        ld0 *= -1;
        double ld3 = 462.61683570589963;
        Output.points[1][6] -= ld0;
if(fo1 != null){
          fd0 = fo1.m3(fb1, fb0, fb1, fb0);
}
        boolean lb4 = false;
        fb0 = fb1 && lb4;
        double ld5 = 356.159781675574;
        Output.points[1][7] -= fd0;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
        Output.points[1][8] += ad1;
        Thought lo0 = Thought180.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
        boolean lb1 = false;
        Output.points[2][0] -= fd1;
        for(int i1=0; i1<10; i1++){
if(fo1 != null){
              fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb0, fb1, lb1, fb0);
}
            fd0 *= -1;
            Thought lo2 = Thought81.getInstance(ao1, ao2, ao3, ao4, fb1, lb1, fb0, fb1);
            lb1 = fd1 < ad1;
if(fo0 != null){
              fb0 = fo0.m2(fo1, ao1, ao2, ao3);
}
            fb1 = !lb1;
            ad2 = ad3 - ad4;
if(ao4 != null){
              fd0 = ao4.m3(fd1, ad1, ad2, ad3);
}
            fb0 = ad4 < fd0;
            double ld3 = 517.4320314025938;
            fb1 = fd0 < fd1;
}}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab1 = !ab2;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ab3 = !ab4;
    fb0 = fb1 && ab1;
    boolean lb0 = true;
if(ao4 != null){
      ao3 = ao4.m4(ab1, ab2, ab3, ab4);
}
    fd0 = fd1 + fd0;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb0;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    boolean lb0 = true;
if(ao1 != null){
      ab1 = ao1.m2(ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fb1, lb0, ab1, ab2);
}
    ab3 = ab4 || fb0;
    Output.points[2][1] += ad2;
    ad3 *= -1;
    fb1 = ad4 < fd0;
if(ao1 != null){
      lb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
    fd1 *= -1;
    Thought lo1 = Thought19.getInstance(ad1, ad2, ad3, ad4);
    ab1 = ab2 || ab3;

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
    fd1 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    fb1 = !fb0;
    fb1 = !fb0;
    fd0 *= -1;
    fb1 = !fb0;
    fb1 = fd1 > fd0;
    Output.points[2][2] -= fd1;
    fb0 = fd0 > fd1;
    fd0 = fd1 + fd0;
    fb1 = fd1 > fd0;
if(fo0 != null){
      fd1 = fo0.m3();
}
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
    double ld0 = 83.3870558946748;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    double ld1 = 493.02043464209555;

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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = fd1 > fd0;
    ab3 = fd1 > fd0;
    ab4 = fb0 || fb1;
    boolean lb0 = true;
    lb0 = fd1 < fd0;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, lb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ab4 = fd0 < fd1;
        boolean lb2 = true;
    ab4 = fb0 || fb1;
if(fo0 != null){
      lb0 = fo0.m2(fd0, fd1, fd0, fd1);
}
    lb1 = fd0 < fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    lb2 = fd1 < fd0;
    double ld3 = 600.2162860212679;
    for(int i0=0; i0<10; i0++){
        ab1 = ab2 && ab3;
        ab4 = fd0 < fd1;
if(fo0 != null){
          ld3 = fo0.m3();
}
        fb0 = fb1 || lb0;
        double ld4 = 260.8109164534236;
if(fo1 != null){
          lb1 = fo1.m2(lb2, ab1, ab2, ab3);
}
        Output.points[2][3] += ld3;
        Output.points[2][4] -= fd0;
if(fo0 != null){
          ab4 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld4, ld3, fd0, fb0, fb1, lb0, lb1);
}
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fb0 = fo0.m2(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought391.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fd0 < fd1;
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fb1 = lb1 && fb0;
if(fo0 != null){
      fb1 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, lb1, fb0);
}
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb1, lb1, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
}
    fb0 = fb1 || lb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld2 = 802.1343934683656;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld2, ad1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fd1 = ld2 + ad1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb1, fb0, fb1);
}
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      fo0.m2(ld2, ad1, ad2, ad3, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
}
    ad4 = fd0 - fd1;

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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    ab2 = ad1 < ad2;
    Output.points[2][5] += ad3;
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    ab3 = ab4 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m1(fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    ab1 = ad3 < ad4;
    ab2 = ab3 && ab4;
    if (fb0) {
        fd0 = fd1 - ad1;
        ad2 = ad3 + ad4;
        fb1 = ab1 || ab2;
        } else if (ab3) {
        ab4 = fb0 || fb1;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    if (fb0) {
        if (fb1) {
            fd1 = fd0 - fd1;
            fb0 = fb1 || fb0;
            if (fb1) {
                double ld0 = 779.8537812373971;
                ld0 = fd0 + fd1;
                double ld1 = 372.88622611890486;
                fb0 = !fb1;
if(ao4 != null){
                  ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
                fb0 = fb1 && fb0;
if(ao3 != null){
                  fb1 = ao3.m2(ao4, fo0, fo1, ao1);
}
                double ld2 = 492.25599428867685;
                for(int i0=0; i0<10; i0++){
if(ao2 != null){
                      fb0 = ao2.m2(ld0, ld1, ld2, fd0);
}
if(ao4 != null){
                      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld0, ld1, ld2);
}
                    fb1 = fd0 > fd1;
if(ao3 != null){
                      ld0 = ao3.m3();
}
                    boolean lb3 = false;
if(ao4 != null){
                      lb3 = ao4.m2(fb0, fb1, lb3, fb0);
}
                    double ld4 = 289.7926636385104;
if(fo0 != null){
                      ld0 = fo0.m3(fo1, ao1, ao2, ao3, ld1, ld2, fd0, fd1, fb1, lb3, fb0, fb1);
}
}}}}
Thought.STACK_COUNTER++;
return ao4;
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
    Thought lo0 = Thought30.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
    Output.points[2][6] -= fd0;
    Thought lo1 = Thought116.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3);
}
    Thought lo2 = Thought1.getInstance(ad1, ad2, ad3, ad4);
    double ld3 = 987.7386324446479;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld3);
}
    Output.points[2][7] += ad1;
    Output.points[2][8] += ad2;
    ad3 = ad4 + fd0;
    fb0 = fd1 > ld3;
    ad1 *= -1;
    ad2 = ad3 - ad4;
if(fo0 != null){
      ao4 = fo0.m4();
}
if(fo1 != null){
      fo1.m2(fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld3, ad1, fb1, fb0, fb1, fb0);
}
    boolean lb4 = true;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, fb0, fb1, lb4, fb0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought108.getInstance(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4);
}
    fd0 = fd1 + fd0;
    Thought lo1 = Thought205.getInstance(fd1, fd0, fd1, fd0);
    if (fb1) {
        for(int i0=0; i0<10; i0++){
            double ld2 = 290.7397077696898;
if(fo0 != null){
              fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, ld2, fd0, fd1);
}
            ld2 = fd0 - fd1;
            ld2 *= -1;
if(ao4 != null){
              ao4.m3();
}
            ab1 = !ab2;
            ab3 = !ab4;
            fb0 = fd0 > fd1;
            ld2 = fd0 + fd1;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
        ab2 = ad4 > fd0;
    Output.points[3][0] -= fd1;
    boolean lb0 = true;
    ab2 = ab3 || ab4;
    Output.points[3][1] -= ad1;
if(ao2 != null){
      ao2.m3(fb0, fb1, lb0, ab1);
}
    boolean lb1 = true;
    Output.points[3][2] -= ad2;

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
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb1 = fd1 < fd0;
if(fo1 != null){
      fb0 = fo1.m2();
}
    double ld0 = 412.57597554316925;
if(fo0 != null){
      fd0 = fo0.m3(fb1, fb0, fb1, fb0);
}
    fd1 = ld0 + fd0;
    fb1 = !fb0;
    fd1 = ld0 - fd0;
    fb1 = !fb0;
    boolean lb1 = true;

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
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    double ld0 = 931.6697176320397;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
    lb1 = fd1 < ld0;
    fd0 *= -1;
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
}
    fd1 *= -1;
    fb1 = lb1 && fb0;
    fb1 = ld0 < fd0;

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
    fd0 = fd1 + fd0;
    double ld0 = 92.0823873668902;
    fb0 = fd0 < fd1;
    ld0 *= -1;
        fb1 = fb0 || fb1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1);
}
    boolean lb1 = true;
    lb1 = fb0 || fb1;
    Thought lo2 = Thought319.getInstance(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);

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
