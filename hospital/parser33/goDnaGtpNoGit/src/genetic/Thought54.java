package genetic;
import java.util.ArrayList;
class Thought54 extends Thought{
private static ArrayList<Thought54> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 66.74209091986253;
private double fd1 = 552.028773081093;
private Thought fo0 = null;
private Thought fo1 = null;
Thought54 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought54 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought54 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought54 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought54 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought54 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought54 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought54 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought54 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought54 instance = new Thought54 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought54 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought54 instance = new Thought54 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought54 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought54 instance = new Thought54 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought54 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought54 instance = new Thought54 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought54 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought54 instance = new Thought54 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought54 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought54 instance = new Thought54 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought54 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought54 instance = new Thought54 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought54 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought54 instance = new Thought54 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
if(fo1 != null){
          fo1.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
        boolean lb1 = false;
    Thought lo2 = Thought44.getInstance(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb0);
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb3 = false;
    lb0 = !lb1;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    fd0 *= -1;
    double ld4 = 264.19635805524734;
    fd0 = fd1 + ld4;
    boolean lb5 = true;
    double ld6 = 982.2800065915949;
    Output.points[8][8] -= ld6;
if(fo0 != null){
      fo0.m3();
}
if(fo1 != null){
      fo1.m3(lb3, lb5, fb0, fb1);
}
    lb0 = !lb1;

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
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fd1 = fd0 + fd1;
    fb0 = fb1 && ab1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    Thought lo0 = Thought307.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    ab4 = fb0 && fb1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    boolean lb1 = true;
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb1, ab1, ab2);
}
    ab3 = !ab4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
    fb1 = fd1 < fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    lb1 = !ab1;
    ab2 = !ab3;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3();
}
    fd0 *= -1;
    boolean lb2 = true;
    boolean lb3 = false;
    ab2 = ab3 && ab4;

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
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = ad1 < ad2;
    fb0 = fb1 && fb0;
    fb1 = ad3 < ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    ad3 = ad4 - fd0;
    boolean lb0 = false;
    Output.points[0][0] -= fd1;
    ad1 = ad2 + ad3;
    lb0 = !fb0;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Output.points[0][1] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
    lb0 = !fb0;
    double ld1 = 299.3484772912069;
    boolean lb2 = false;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    double ld3 = 54.11397852901345;
        fb0 = !fb1;
        Thought lo4 = Thought74.getInstance();
if(fo0 != null){
      ld1 = fo0.m3(lb0, lb2, fb0, fb1);
}
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, ld3, ad1, ad2, ad3, lb2, fb0, fb1, lb0);
}
    Output.points[0][2] += ad4;
    Thought lo5 = Thought22.getInstance(fd0, fd1, ld1, ld3, lb2, fb0, fb1, lb0);

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
    boolean lb0 = true;
    ab1 = ab2 || ab3;
    ab4 = fb0 || fb1;
    lb0 = ad1 > ad2;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, ab1, ab2, ab3);
}
    ab4 = ad3 > ad4;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fb0 = !fb1;
    fd0 *= -1;
    fd1 = ad1 - ad2;
    lb0 = lb1 || ab1;
if(fo1 != null){
      ab2 = fo1.m2(ad3, ad4, fd0, fd1);
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
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    for(int i0=0; i0<10; i0++){
        fd0 *= -1;
        fd1 = fd0 + fd1;
        Thought lo0 = Thought164.getInstance();
        double ld1 = 481.51836228944177;
        double ld2 = 523.9659935919647;
        }
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    fd1 *= -1;

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
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    double ld0 = 464.0648964036471;
if(fo1 != null){
      fo1.m1(fd0, fd1, ld0, ad1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4);
}
    ad3 *= -1;
    fb0 = ad4 < fd0;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m1(fd1, ld0, ad1, ad2);
}
if(fo1 != null){
      ad3 = fo1.m3(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld0);
}
    fb0 = ad1 < ad2;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(ao1 != null){
      ao1.m2(fb0, fb1, lb1, fb0);
}
    fb1 = lb1 || fb0;
    Output.points[0][3] += ad3;
if(ao2 != null){
      ad4 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ad1, fb1, lb1, fb0, fb1);
}
    double ld2 = 470.2760761462021;
    ad1 = ad2 - ad3;
    ad4 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld0, ld2, lb1, fb0, fb1, lb1);
}
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, lb1, fb0);
}
    boolean lb3 = true;
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1);
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
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    Output.points[0][4] -= fd1;
    fd0 *= -1;
    Thought lo0 = Thought311.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
    ab1 = ab2 || ab3;
    Output.points[0][5] += fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      ab4 = fo1.m2();
}
    fd1 *= -1;

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
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4(lb0, ab1, ab2, ab3);
}
    Output.points[0][6] += ad1;
    Output.points[0][7] -= ad2;
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, ab4, fb0, fb1, lb0);
}
    ad2 = ad3 + ad4;
    ab1 = ab2 || ab3;
    fd0 = fd1 - ad1;
    ab4 = ad2 < ad3;
    fb0 = ad4 > fd0;
    Thought lo1 = Thought289.getInstance(fd1, ad1, ad2, ad3, fb1, lb0, ab1, ab2);
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
    lb0 = ad4 > fd0;
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(ao1 != null){
      ad3 = ao1.m3();
}
    ab2 = ab3 || ab4;
    fb0 = ad4 < fd0;
    fb1 = fd1 < ad1;
    ad2 = ad3 + ad4;
    fd0 = fd1 + ad1;
    lb0 = ab1 && ab2;
    double ld2 = 601.0065715445864;
    boolean lb3 = true;
    Thought lo4 = Thought122.getInstance(ab2, ab3, ab4, fb0);
    ad1 = ad2 - ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld2, fb1, lb0, lb3, ab1);
}
    double ld5 = 380.29383762535343;

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
    fb1 = fd1 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb1 = fd1 < fd0;
    double ld0 = 272.04771490409377;
    fd0 *= -1;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m2(fd1, ld0, fd0, fd1);
}
    lb1 = ld0 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
    fb0 = !fb1;
if(fo1 != null){
      ld0 = fo1.m3();
}

Thought.STACK_COUNTER++;
return lb1;
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
    Output.points[0][8] += fd1;
if(fo0 != null){
      fo0.m3(ab2, ab3, ab4, fb0);
}
    double ld0 = 915.1219091522994;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 < ld0;
    fd0 = fd1 - ld0;
    fd0 *= -1;
    ab1 = fd1 < ld0;
    boolean lb1 = false;
    boolean lb2 = false;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 - ld0;
    boolean lb3 = true;
    boolean lb4 = false;
    lb2 = lb3 || lb4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
    ab1 = fd0 < fd1;
    Output.points[1][0] -= ld0;
    fd0 = fd1 + ld0;
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo0 = fo1.m4();
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought378.getInstance(fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < ad1;
    Thought lo1 = Thought265.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
    boolean lb2 = false;
    boolean lb3 = true;
    fd1 = ad1 + ad2;
    Thought lo4 = Thought247.getInstance(fo1, fo0, fo1, fo0, lb2, lb3, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Output.points[1][1] += ad3;
    lb2 = lb3 || fb0;
if(fo1 != null){
      fo1.m2(ad4, fd0, fd1, ad1);
}
    double ld5 = 493.5792528544315;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fb1 = fd0 < fd1;
    Thought lo6 = Thought142.getInstance();
    Thought lo7 = Thought97.getInstance(lb2, lb3, fb0, fb1);
    lb2 = lb3 && fb0;

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought251.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
    fd0 = fd1 - ad1;
    ad2 = ad3 - ad4;
    boolean lb1 = true;
    ab4 = fb0 && fb1;
    Thought lo2 = Thought221.getInstance(fd0, fd1, ad1, ad2, lb1, ab1, ab2, ab3);
    ab4 = fb0 || fb1;
    Thought lo3 = Thought71.getInstance(fo0, fo1, fo0, fo1, lb1, ab1, ab2, ab3);
    ad3 = ad4 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 = ad1 - ad2;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, lb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    Output.points[1][2] -= ad3;
    ad4 = fd0 - fd1;
    fb0 = ad1 < ad2;
    fb1 = lb1 && ab1;
    boolean lb4 = true;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Thought lo5 = Thought256.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb1, lb4);
    ab1 = ad1 < ad2;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    if (lb0) {
if(ao2 != null){
          fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
          ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
        Thought lo1 = Thought185.getInstance();
        } else if (fb0) {
        fd1 = fd0 - fd1;
        fb1 = fd0 > fd1;
        boolean lb2 = true;
if(ao3 != null){
          fd0 = ao3.m3(lb2, lb0, fb0, fb1);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, lb2, lb0, fb0, fb1);
}
        Output.points[1][3] -= fd1;
        Output.points[1][4] += fd0;
        double ld3 = 300.0342609472809;
        lb2 = fd0 > fd1;
        ld3 = fd0 - fd1;
if(ao4 != null){
          ao4.m1(ld3, fd0, fd1, ld3, lb0, fb0, fb1, lb2);
}
        lb0 = fd0 < fd1;
if(fo0 != null){
          fo0.m1(fo1, ao1, ao2, ao3, fb0, fb1, lb2, lb0);
}
        fb0 = ld3 < fd0;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
        boolean lb4 = true;
        fb0 = fb1 || lb2;
        boolean lb5 = false;
if(ao4 != null){
          lb4 = ao4.m2(fd1, ld3, fd0, fd1);
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
    boolean lb0 = true;
    boolean lb1 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(ao1 != null){
      lb0 = ao1.m2();
}
        lb1 = fd0 > fd1;
    Thought lo2 = Thought82.getInstance(fb0, fb1, lb0, lb1);
    Output.points[1][5] -= ad1;
    double ld3 = 762.3953997321856;
    Thought lo4 = Thought193.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb1);
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ld3, ad1, fb0, fb1, lb0, lb1);
}
    Output.points[1][6] -= ad2;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, lb0, lb1, fb0);
}
    ad3 = ad4 - fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld3, ad1, ad2);
}
    fb1 = ad3 > ad4;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ld3, ad1, ad2);
}
    lb0 = lb1 || fb0;

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
    ab1 = !ab2;
    double ld0 = 385.9151663236351;
    boolean lb1 = true;
    fd0 = fd1 + ld0;
if(ao2 != null){
      ao2.m2();
}
if(ao4 != null){
      ao3 = ao4.m4(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ld0, fd0, fb1, lb1, ab1, ab2);
}
if(fo0 != null){
      fo0.m1(fd1, ld0, fd0, fd1, ab3, ab4, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        lb1 = ld0 < fd0;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fb0 = fo1.m2(ao1, ao2, ao3, ao4);
}
        for(int i1=0; i1<10; i1++){
}}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    ab1 = ab2 || ab3;
    boolean lb0 = true;
    ad4 = fd0 - fd1;
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0);
}
    boolean lb1 = true;
    for(int i0=0; i0<10; i0++){
        ab2 = fd1 < ad1;
        boolean lb2 = true;
        ab2 = ab3 && ab4;
if(ao2 != null){
          ad2 = ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(ao1 != null){
          fb0 = ao1.m2();
}
        Output.points[1][7] += ad1;
if(ao2 != null){
          ao2.m2(fb1, lb2, lb0, lb1);
}
        ab1 = ab2 && ab3;
        ad2 = ad3 - ad4;
        ab4 = fb0 || fb1;
        boolean lb3 = true;
if(ao3 != null){
          fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, lb2, lb3, lb0, lb1);
}
        ab1 = ad4 < fd0;
        ab2 = ab3 || ab4;
        }
    Thought lo4 = Thought168.getInstance(fd1, ad1, ad2, ad3, lb0, lb1, ab1, ab2);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
    ad4 = fd0 - fd1;
    ad1 *= -1;
    lb0 = !lb1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    boolean lb5 = false;

Thought.STACK_COUNTER++;
return lb5;
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
    Output.points[1][8] -= fd1;
    Thought lo0 = Thought139.getInstance(fd0, fd1, fd0, fd1);
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m2();
}
    fd0 = fd1 - fd0;
    fb0 = !fb1;
    fb0 = !fb1;
    fb0 = fb1 && fb0;
    fb1 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    fd0 *= -1;
    fb1 = fb0 || fb1;
    fb0 = !fb1;
    fb0 = fd1 > fd0;
    Thought lo1 = Thought47.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);

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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 525.3322947401164;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
    Thought lo1 = Thought366.getInstance();
    ab2 = fd1 > ld0;
    ab3 = fd0 > fd1;
    ld0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, ab1);
}
    Thought lo2 = Thought291.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);
if(fo1 != null){
      fo1.m3(fd1, ld0, fd0, fd1, fb1, ab1, ab2, ab3);
}
    boolean lb3 = false;
    boolean lb4 = true;
    ab2 = ld0 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    lb3 = ld0 < fd0;
    lb4 = fd1 > ld0;
    fd0 = fd1 + ld0;
    ab1 = fd0 < fd1;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Output.points[2][0] += fd0;
    Thought lo5 = Thought3.getInstance(fd1, ld0, fd0, fd1);
    ab2 = ld0 < fd0;

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
    fb0 = fb1 || fb0;
    double ld0 = 64.06335903304071;
    boolean lb1 = true;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
        fd0 *= -1;
    Thought lo2 = Thought198.getInstance();
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(lb3, fb0, fb1, lb1);
}
    lb3 = fd1 > ld0;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, lb1, lb3);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, ad1, ad2, fb0, fb1, lb1, lb3);
}

Thought.STACK_COUNTER++;
return ad3;
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
    double ld0 = 949.3060739448047;
    boolean lb1 = false;
    Thought lo2 = Thought127.getInstance(fo0, fo1, fo0, fo1, lb1, ab1, ab2, ab3);
    ab4 = ld0 > ad1;
    fb0 = !fb1;
    lb1 = ad2 > ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld3 = 979.0829796542768;
    ab1 = !ab2;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld0, ld3, ad1, ad2);
}
    Output.points[2][1] -= ad3;
    boolean lb4 = true;
    ab2 = ab3 || ab4;
    ad4 *= -1;
    for(int i0=0; i0<10; i0++){
        boolean lb5 = false;
        ab4 = fd0 < fd1;
if(fo1 != null){
          ld0 = fo1.m3();
}
        ld3 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, lb5, lb1);
}
        boolean lb6 = true;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, lb1, lb4, ab1, ab2);
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fb0 = ao1.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
        fd1 = fd0 + fd1;
    fb1 = fd0 < fd1;
    Thought lo0 = Thought183.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    boolean lb1 = true;
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    lb1 = fd1 > fd0;
    fb0 = fb1 || lb1;
    boolean lb2 = false;
    boolean lb3 = false;
    lb2 = !lb3;
    boolean lb4 = true;
    fd1 *= -1;
    lb4 = fd0 > fd1;
    fb0 = fd0 < fd1;

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
    ad2 = ad3 - ad4;
    Output.points[2][2] += fd0;
if(ao2 != null){
      fd1 = ao2.m3();
}
    Thought lo0 = Thought182.getInstance(fb1, fb0, fb1, fb0);
    fb1 = !fb0;
    double ld1 = 765.4941891331625;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ad4 = ao3.m3(fd0, fd1, ld1, ad1, fb1, fb0, fb1, fb0);
}
    ad2 = ad3 - ad4;
    fb1 = fb0 || fb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
    Thought lo2 = Thought49.getInstance(ao4, fo0, fo1, ao1);
    fb0 = fb1 || fb0;
if(ao2 != null){
      ao2.m1(fd0, fd1, ld1, ad1);
}
    Output.points[2][3] -= ad2;
    ad3 = ad4 + fd0;
    fd1 = ld1 - ad1;
    Output.points[2][4] -= ad2;

Thought.STACK_COUNTER++;
return ad3;
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
    boolean lb0 = true;
    fd0 = fd1 - fd0;
    fd1 *= -1;
    Output.points[2][5] += fd0;
    Thought lo1 = Thought362.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
    fd1 = fd0 + fd1;
    ab1 = fd0 > fd1;
    double ld2 = 74.1382435428609;
    boolean lb3 = true;
    boolean lb4 = false;
if(fo0 != null){
          fo0.m1();
}
    ld2 *= -1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
    ad2 *= -1;
    double ld0 = 406.5080988884062;
        Thought lo1 = Thought265.getInstance(ab1, ab2, ab3, ab4);
    fb0 = ad2 < ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    ab1 = ab2 && ab3;
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
    ab2 = fd0 < fd1;
    ld0 = ad1 - ad2;
    boolean lb2 = false;
if(ao4 != null){
      ab2 = ao4.m2(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ad3 = ao3.m3(ad4, fd0, fd1, ld0);
}
if(ao4 != null){
      ad1 = ao4.m3(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
    fd1 = ld0 - ad1;
    lb2 = ab1 || ab2;
if(ao3 != null){
      ad2 = ao3.m3();
}

Thought.STACK_COUNTER++;
return ad3;
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
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    Thought lo0 = Thought328.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
    Thought lo1 = Thought365.getInstance(fo1, fo0, fo1, fo0);
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Output.points[2][6] += fd1;
    boolean lb2 = true;
    fd0 = fd1 - fd0;
if(fo1 != null){
      lb2 = fo1.m2();
}
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    double ld3 = 717.9695130511275;
    Thought lo4 = Thought221.getInstance(fb0, fb1, lb2, fb0);
    fb1 = fd0 < fd1;

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
    ab1 = ab2 || ab3;
    if (ab4) {
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
        double ld0 = 443.13376454171237;
        double ld1 = 859.9678985016757;
        double ld2 = 333.20742108510063;
        } else if (ab3) {
        fd0 = fd1 - fd0;
        Thought lo3 = Thought322.getInstance(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
        Thought lo4 = Thought15.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
          fo1.m1(fd1, fd0, fd1, fd0);
}
        Output.points[2][7] += fd1;
        boolean lb5 = true;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
        fb0 = fd0 < fd1;
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo0 != null){
          fd0 = fo0.m3(fb1, lb5, ab1, ab2);
}
if(fo1 != null){
          ab3 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb5);
}
        ab1 = !ab2;
if(fo0 != null){
          ab3 = fo0.m2(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb5);
}
        double ld6 = 724.7699809115938;
        fd0 *= -1;
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
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
    boolean lb0 = false;
    Output.points[2][8] += fd1;
    lb0 = fb0 && fb1;
    boolean lb1 = true;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    for(int i0=0; i0<10; i0++){
        }
    fd1 = ad1 - ad2;
    lb0 = ad3 > ad4;
if(fo1 != null){
      fd0 = fo1.m3();
}
    Thought lo2 = Thought365.getInstance(lb1, fb0, fb1, lb0);
    lb1 = fb0 || fb1;
    lb0 = lb1 && fb0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, lb0, lb1, fb0);
}
    fb1 = !lb0;
    lb1 = fb0 || fb1;
    fd0 = fd1 - ad1;
if(fo1 != null){
      fo1.m3(ad2, ad3, ad4, fd0, lb0, lb1, fb0, fb1);
}
    lb0 = !lb1;
    fd1 *= -1;
    boolean lb3 = true;
    lb3 = ad1 < ad2;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    boolean lb4 = true;

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
    Thought lo0 = Thought83.getInstance(ad1, ad2, ad3, ad4);
    Thought lo1 = Thought382.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
    ab1 = ad3 < ad4;
        double ld2 = 184.58957360611396;
    ad4 = fd0 + fd1;
if(fo1 != null){
      ld2 = fo1.m3();
}
    boolean lb3 = false;
    Thought lo4 = Thought197.getInstance(ab1, ab2, ab3, ab4);
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, lb3, ab1);
}
    Thought lo5 = Thought339.getInstance(fd1, ld2, ad1, ad2, ab2, ab3, ab4, fb0);
    Output.points[3][0] -= ad3;
    double ld6 = 103.22426509015051;
    if (fb1) {
        boolean lb7 = true;
        lb7 = ad3 < ad4;
        } else if (ab1) {
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
        Thought lo8 = Thought359.getInstance(fo0, fo1, fo0, fo1);
        fb1 = !lb3;
        fd0 = fd1 - ld2;
if(fo0 != null){
          fo0.m1(ld6, ad1, ad2, ad3);
}
        ab1 = ab2 && ab3;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld2);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        ab4 = ld6 > ad1;
if(fo0 != null){
          fb0 = fo0.m2(fb1, lb3, ab1, ab2);
}
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd1 < fd0;
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
    fb1 = fd1 > fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
    boolean lb0 = true;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, lb0, fb0);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      fb1 = ao2.m2(fd0, fd1, fd0, fd1);
}
    Output.points[3][1] -= fd0;
    lb0 = fd1 > fd0;
    fb0 = fd1 < fd0;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    fb0 = fd1 > ad1;
    for(int i0=0; i0<10; i0++){
        fb1 = ad2 > ad3;
if(ao2 != null){
          ad4 = ao2.m3();
}
        fd0 = fd1 - ad1;
        fb0 = fb1 && fb0;
        fb1 = ad2 < ad3;
if(ao3 != null){
          ao3.m3(fb0, fb1, fb0, fb1);
}
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
          ao3 = ao4.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fb0 = fo0.m2(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
        fb1 = fd1 > ad1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
        ad2 *= -1;
        ad3 *= -1;
if(ao4 != null){
          ad4 = ao4.m3(fd0, fd1, ad1, ad2);
}
        fb0 = ad3 < ad4;
        boolean lb0 = true;
        }
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2);
}

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought161.getInstance();
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    ab2 = !ab3;
    boolean lb1 = false;
    if (ab3) {
        ab4 = fd1 < fd0;
        fb0 = fb1 && lb1;
        for(int i0=0; i0<10; i0++){
if(ao4 != null){
              ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
              fb0 = ao3.m2(fd1, fd0, fd1, fd0, fb1, lb1, ab1, ab2);
}
            ab3 = !ab4;
            boolean lb2 = true;
            fd1 = fd0 + fd1;
            ab4 = fd0 > fd1;
            double ld3 = 175.05253234382965;
if(fo0 != null){
              ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb2, lb1);
}
if(fo0 != null){
              ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
              ao4 = fo0.m4(ld3, fd0, fd1, ld3);
}
            fd0 = fd1 - ld3;
            Thought lo4 = Thought203.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, ld3, fd0);
if(fo0 != null){
              ao4 = fo0.m4();
}
            ab1 = ab2 && ab3;
if(fo1 != null){
              fo1.m1(ab4, fb0, fb1, lb2);
}
}}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought147.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
    boolean lb1 = true;
    Output.points[3][2] += fd0;
    Thought lo2 = Thought306.getInstance(fd1, ad1, ad2, ad3, fb0, fb1, lb1, ab1);
    Thought lo3 = Thought282.getInstance(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
    double ld4 = 446.4917170715312;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    fb1 = ad3 > ad4;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld4, ad1);
}
    lb1 = !ab1;
if(fo1 != null){
      ad2 = fo1.m3(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(ao1 != null){
      ab2 = ao1.m2(ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ld4 = ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, lb1, ab1, ab2, ab3);
}
if(ao1 != null){
      ab4 = ao1.m2(fd0, fd1, ld4, ad1, fb0, fb1, lb1, ab1);
}
    Thought lo5 = Thought6.getInstance(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
    fb1 = lb1 && ab1;
    ad2 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    double ld6 = 122.86373937885206;
    double ld7 = 890.9134372897139;
        for(int i0=0; i0<10; i0++){
        ab2 = !ab3;
if(fo1 != null){
          ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
        ab4 = fd1 > ld4;
        fb0 = fb1 && lb1;
        }

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought312.getInstance();
    fb1 = fd1 > fd0;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > fd0;
    boolean lb1 = true;
    lb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb1);
}
    Output.points[3][3] -= fd1;
    fd0 = fd1 - fd0;
    Output.points[3][4] += fd1;
    Thought lo2 = Thought305.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
    boolean lb3 = false;
    double ld4 = 162.20735104845042;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ld4 = fd0 - fd1;
    ld4 *= -1;
    fb0 = !fb1;
    Thought lo5 = Thought222.getInstance(fd0, fd1, ld4, fd0);
    boolean lb6 = false;
    lb1 = lb3 || lb6;
    fb0 = fd1 > ld4;
    fd0 = fd1 - ld4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld4, fd0);
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
          fo1.m3();
}
    double ld0 = 234.19404854043023;
    ld0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    Output.points[3][5] -= fd0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
    double ld1 = 582.6711038379101;
if(fo1 != null){
      ld0 = fo1.m3(ld1, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    Thought lo2 = Thought149.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = ld1 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(ld0, ld1, fd0, fd1);
}
    double ld3 = 798.8722029473153;
    fb0 = ld0 < ld1;
    boolean lb4 = false;
    Thought lo5 = Thought343.getInstance(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld0);

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
    fb1 = !fb0;
    Thought lo0 = Thought39.getInstance();
if(fo1 != null){
      fd1 = fo1.m3(fb1, fb0, fb1, fb0);
}
    double ld1 = 529.8941441429779;
    ld1 = fd0 + fd1;
    Output.points[3][6] += ld1;
    fd0 = fd1 - ld1;
    fd0 = fd1 - ld1;
    fd0 *= -1;
    boolean lb2 = false;
    fb0 = fd1 < ld1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, fb1, lb2, fb0, fb1);
}
if(fo0 != null){
      lb2 = fo0.m2(fd1, ld1, fd0, fd1, fb0, fb1, lb2, fb0);
}
    Output.points[3][7] -= ld1;
    double ld3 = 724.6606781029179;
    ld3 = fd0 + fd1;
    fb1 = !lb2;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb2, fb0);
}
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb1 = fo0.m2(ld3, fd0, fd1, ld1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld1);
}
    lb2 = ld3 < fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb2, fb0);
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
}
