package genetic;
import java.util.ArrayList;
class Thought157 extends Thought{
private static ArrayList<Thought157> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 570.3737282549798;
private double fd1 = 982.4333586768219;
private Thought fo0 = null;
private Thought fo1 = null;
Thought157 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought157 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought157 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought157 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought157 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought157 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought157 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought157 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought157 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought157 instance = new Thought157 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought157 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought157 instance = new Thought157 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought157 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought157 instance = new Thought157 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought157 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought157 instance = new Thought157 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought157 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought157 instance = new Thought157 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought157 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought157 instance = new Thought157 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought157 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought157 instance = new Thought157 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought157 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought157 instance = new Thought157 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    double ld0 = 145.45247513121743;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
    fb0 = fb1 && fb0;
    fd0 = fd1 - ld0;
    fb1 = fd0 > fd1;
if(fo1 != null){
      ld0 = fo1.m3();
}
if(fo0 != null){
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
        fd0 *= -1;
    double ld1 = 58.319598983849765;
    fb1 = !fb0;
    fb1 = fd0 < fd1;
    Output.points[6][0] += ld0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
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
    fd1 = fd0 + fd1;
        ab1 = fd0 < fd1;
    boolean lb0 = true;
    ab1 = ab2 || ab3;
    Output.points[6][1] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    Thought lo1 = Thought58.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);

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
    ad2 = ad3 + ad4;
    Thought lo0 = Thought130.getInstance();
    double ld1 = 308.69695873916237;
    boolean lb2 = true;
    Thought lo3 = Thought140.getInstance(fb0, fb1, lb2, fb0);
    boolean lb4 = false;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1, fb0, fb1, lb2, lb4);
}
    boolean lb5 = true;
    lb5 = fb0 && fb1;
    ad1 = ad2 + ad3;
    lb2 = !lb4;
    lb5 = ad4 < fd0;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, ad1, ad2, lb2, lb4, lb5, fb0);
}
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb2, lb4, lb5);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad4 *= -1;
    boolean lb6 = false;
    double ld7 = 138.68585661152704;
    ad4 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, ld7);
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
    ab2 = ad1 < ad2;
    Thought lo0 = Thought267.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab3 = ad1 > ad2;
        boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb1, ab1, ab2, ab3);
}
    ad1 = ad2 + ad3;
if(fo1 != null){
          fo0 = fo1.m4(ad4, fd0, fd1, ad1, ab4, fb0, fb1, lb1);
}
    ab1 = !ab2;
    ab3 = ab4 && fb0;
    Output.points[6][2] += ad2;
    Thought lo2 = Thought207.getInstance(fo0, fo1, fo0, fo1, fb1, lb1, ab1, ab2);

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
    fd0 = fd1 - fd0;
    double ld0 = 764.015462502102;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0);
}
    fd0 = fd1 + ld0;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ld0, fd0);
}
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0);
}
    Thought lo1 = Thought351.getInstance();
    fb0 = fb1 || fb0;
    boolean lb2 = false;
    double ld3 = 482.2865026352765;
    boolean lb4 = true;
if(ao2 != null){
      ao1 = ao2.m4(lb4, fb0, fb1, lb2);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ld3, fd0, fd1, ld0, lb4, fb0, fb1, lb2);
}
    double ld5 = 972.9542214312374;
if(ao2 != null){
      ld3 = ao2.m3(ld5, fd0, fd1, ld0, lb4, fb0, fb1, lb2);
}
    ld3 *= -1;
    Thought lo6 = Thought215.getInstance(ao3, ao4, fo0, fo1, lb4, fb0, fb1, lb2);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ld5 *= -1;
    boolean lb7 = false;
    Output.points[6][3] -= fd0;
if(ao1 != null){
      ao1.m3(fd1, ld0, ld3, ld5);
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
    ad2 = ad3 - ad4;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
if(ao1 != null){
      fd1 = ao1.m3();
}
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
    ad1 = ad2 - ad3;
    ad4 *= -1;
    boolean lb0 = false;
    if (fb0) {
        fd0 = fd1 - ad1;
        } else if (fb1) {
        lb0 = !fb0;
        boolean lb1 = false;
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
    ab1 = fd1 < fd0;
    fd1 = fd0 - fd1;
    boolean lb0 = false;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb1 = true;
    fd1 = fd0 + fd1;
if(ao1 != null){
      ab4 = ao1.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
    Thought lo2 = Thought27.getInstance(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
    fb0 = !fb1;
    fd0 = fd1 + fd0;
    double ld3 = 397.98271374818967;
    lb0 = lb1 && ab1;
    double ld4 = 839.6097296649674;
    if (ab2) {
        ld4 = fd0 - fd1;
        Output.points[6][4] += ld3;
        ab3 = ld4 > fd0;
        ab4 = fd1 > ld3;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
        fb0 = !fb1;
if(ao1 != null){
          fo1 = ao1.m4(ld4, fd0, fd1, ld3);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    if (ab1) {
if(ao1 != null){
          ad1 = ao1.m3();
}
        ad2 = ad3 + ad4;
if(ao2 != null){
          ao2.m1(ab2, ab3, ab4, fb0);
}
        Thought lo0 = Thought357.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
        boolean lb1 = true;
        double ld2 = 599.6011026763991;
        ad2 *= -1;
        for(int i0=0; i0<10; i0++){
            double ld3 = 584.1396934896466;
}}
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
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
    fb0 = fb1 && fb0;
    if (fb1) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        boolean lb0 = false;
        fd0 = fd1 - fd0;
        fd1 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
        Thought lo1 = Thought47.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
if(fo0 != null){
          fd0 = fo0.m3();
}
        } else {
        boolean lb2 = true;
        Thought lo3 = Thought262.getInstance(lb2, fb0, fb1, lb2);
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb2, fb0, fb1);
}
        Output.points[6][5] += fd1;
        boolean lb4 = false;
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
        fb0 = fd1 < fd0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        fd0 *= -1;
        fd1 *= -1;
if(fo1 != null){
          fo1.m2();
}
        fd0 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fb1, ab1, ab2, ab3);
}
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
        boolean lb0 = false;
        boolean lb1 = false;
        lb1 = fd0 > fd1;
        for(int i1=0; i1<10; i1++){
if(fo1 != null){
              fd0 = fo1.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
            fd1 *= -1;
            fd0 = fd1 + fd0;
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
            fd1 = fd0 - fd1;
if(fo0 != null){
              ab1 = fo0.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
              fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
}}
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4();
}
    for(int i0=0; i0<10; i0++){
        Output.points[6][6] -= ad2;
if(fo0 != null){
          fo0.m3(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
        fb0 = ad1 > ad2;
        fb1 = !fb0;
if(fo0 != null){
          fo0.m1(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 || fb1;
        boolean lb0 = false;
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, ab1);
}
    Thought lo1 = Thought243.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
    double ld2 = 833.5900477997357;
if(fo1 != null){
      fo0 = fo1.m4(ld2, ad1, ad2, ad3, fb1, lb0, ab1, ab2);
}
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    ld2 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      lb0 = fo1.m2(ad1, ad2, ad3, ad4);
}

Thought.STACK_COUNTER++;
return ab1;
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
    fb0 = fd1 > fd0;
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb1 = fb0 || fb1;
    boolean lb0 = true;
    Thought lo1 = Thought230.getInstance(lb0, fb0, fb1, lb0);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fd0 = fd1 - fd0;
    Output.points[6][7] -= fd1;
    fd0 = fd1 + fd0;
    fb1 = !lb0;
    boolean lb2 = false;
if(ao3 != null){
      lb2 = ao3.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb2);
}
    boolean lb3 = false;
    Thought lo4 = Thought19.getInstance(ao4, fo0, fo1, ao1, lb3, fb0, fb1, lb0);
    lb2 = fd1 < fd0;
    fd1 *= -1;
        boolean lb5 = false;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
    fd0 *= -1;
    fd1 = fd0 - fd1;
if(ao1 != null){
      ao1.m1(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;

Thought.STACK_COUNTER++;
return lb3;
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
      ao1.m3();
}
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
    ad1 = ad2 - ad3;
    fb1 = !fb0;
    fb1 = ad4 < fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    double ld0 = 17.341344029333417;
    boolean lb1 = true;
    lb1 = ad3 > ad4;
    fb0 = fb1 || lb1;
    Thought lo2 = Thought74.getInstance(fd0, fd1, ld0, ad1, fb0, fb1, lb1, fb0);
    Thought lo3 = Thought169.getInstance(ao4, fo0, fo1, ao1, fb1, lb1, fb0, fb1);
    Thought lo4 = Thought212.getInstance(ao2, ao3, ao4, fo0);
    Thought lo5 = Thought351.getInstance(ad2, ad3, ad4, fd0);
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, fd1, ld0, ad1, ad2);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ao3.m1(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    fd1 = fd0 - fd1;
    ab1 = !ab2;
    boolean lb0 = false;
    ab2 = fd0 > fd1;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    Thought lo1 = Thought252.getInstance(fo1, ao1, ao2, ao3, lb0, ab1, ab2, ab3);
    Output.points[6][8] += fd0;

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
    Output.points[7][0] += ad2;
    ad3 *= -1;
    ab2 = ad4 < fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ab3 = fd1 > ad1;
    Thought lo0 = Thought6.getInstance(ad2, ad3, ad4, fd0);
    ab4 = fd1 < ad1;
    fb0 = fb1 && ab1;
    boolean lb1 = false;
    double ld2 = 211.34366968079163;
    ad1 = ad2 - ad3;
if(ao2 != null){
      ad4 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ld2, ad1);
}
    ab1 = ab2 || ab3;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ad2 = ad3 - ad4;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    if (fb1) {
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
        fb0 = fd0 > fd1;
        fb1 = !fb0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
        fb1 = fd0 < fd1;
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fo0.m1(fd1, fd0, fd1, fd0);
}
        Thought lo0 = Thought113.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
if(fo0 != null){
          fo1 = fo0.m4();
}
        boolean lb1 = true;
if(fo1 != null){
          fd1 = fo1.m3(lb1, fb0, fb1, lb1);
}
        Output.points[7][1] -= fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
        fd1 = fd0 - fd1;
if(fo0 != null){
          fo0.m3(fd0, fd1, fd0, fd1, fb1, lb1, fb0, fb1);
}
        } else if (fb0) {
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
        fd0 = fd1 + fd0;
        fb1 = !fb0;
        if (fb1) {
            fd1 = fd0 - fd1;
            fb0 = fb1 || fb0;
            Thought lo2 = Thought118.getInstance(fo1, fo0, fo1, fo0);
            fb1 = fd0 < fd1;
}}
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
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
    ab1 = !ab2;
    Output.points[7][2] += fd0;
    for(int i0=0; i0<10; i0++){
        double ld0 = 473.0920726236792;
        ab3 = fd0 < fd1;
if(fo1 != null){
          fo0 = fo1.m4(ab4, fb0, fb1, ab1);
}
        ab2 = ab3 && ab4;
        Thought lo1 = Thought182.getInstance(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
        Output.points[7][3] += fd0;
        double ld2 = 598.6338968912547;
if(fo0 != null){
          fo0.m2(fd0, fd1, ld0, ld2, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
        Thought lo3 = Thought106.getInstance(fo0, fo1, fo0, fo1);
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
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    boolean lb0 = true;
    ad3 = ad4 - fd0;
    boolean lb1 = true;
    Thought lo2 = Thought58.getInstance();
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(lb0, lb1, fb0, fb1);
}
    ad1 = ad2 - ad3;
    Output.points[7][4] += ad4;
    Output.points[7][5] -= fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, lb0, lb1, fb0, fb1);
}
    ad4 = fd0 + fd1;

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
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    fb0 = ad3 < ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    for(int i0=0; i0<10; i0++){
        boolean lb0 = true;
        boolean lb1 = false;
        fd0 *= -1;
        ab2 = fd1 < ad1;
        if (ab3) {
if(fo0 != null){
              ad2 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
              fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
            ad1 *= -1;
            ad2 = ad3 - ad4;
            boolean lb2 = true;
            double ld3 = 459.9326453089186;
if(fo1 != null){
              ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld3, ad1);
}
}}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought254.getInstance();
    double ld1 = 638.1458346010651;
    Output.points[7][6] -= fd0;
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    double ld2 = 112.4149867381686;
    fd0 *= -1;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, ld1, ld2, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ld1 = ao2.m3(ld2, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
}
    for(int i0=0; i0<10; i0++){
        boolean lb3 = false;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb3, fb0);
}
        Thought lo4 = Thought124.getInstance(ao3, ao4, fo0, fo1);
if(ao1 != null){
          ld2 = ao1.m3(fd0, fd1, ld1, ld2);
}
if(ao2 != null){
          fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld1, ld2);
}
        fd0 *= -1;
        Thought lo5 = Thought222.getInstance();
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m2(fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    double ld0 = 907.5485085718182;
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    boolean lb2 = false;
    double ld3 = 776.1559558899713;
if(ao3 != null){
      ao2 = ao3.m4(ld3, ad1, ad2, ad3);
}
    lb2 = ad4 > fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ld0, ld3, ad1);
}
if(ao4 != null){
      ad2 = ao4.m3();
}
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb1, lb2, fb0);
}
    fb1 = lb1 || lb2;
    Thought lo4 = Thought32.getInstance(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, fb0, fb1, lb1, lb2);
    ld0 = ld3 + ad1;
    fb0 = ad2 < ad3;
if(ao4 != null){
      ad4 = ao4.m3(fd0, fd1, ld0, ld3, fb1, lb1, lb2, fb0);
}
    ad1 *= -1;
    Thought lo5 = Thought263.getInstance(fo0, fo1, ao1, ao2, fb1, lb1, lb2, fb0);

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0);
}
    Output.points[7][7] += fd1;
    ab3 = ab4 || fb0;
    fb1 = ab1 && ab2;
    fd0 = fd1 - fd0;
    fd1 *= -1;
    ab3 = !ab4;
    Output.points[7][8] += fd0;
    boolean lb0 = false;
    Thought lo1 = Thought371.getInstance(fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
    Output.points[8][0] -= fd1;
    ab4 = fb0 || fb1;
    lb0 = ab1 || ab2;

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
if(ao2 != null){
      ao1 = ao2.m4();
}
    ab2 = ad2 < ad3;
    boolean lb0 = false;
    ab2 = ab3 || ab4;
    fb0 = fb1 || lb0;
    double ld1 = 103.301639457211;
if(ao3 != null){
      ao3.m1(ab1, ab2, ab3, ab4);
}
    fb0 = ad3 < ad4;
    Thought lo2 = Thought245.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ld1, ad1, fb1, lb0, ab1, ab2);
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      lb0 = ao4.m2(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
        fb0 = fb1 && lb0;
if(ao3 != null){
          fd1 = ao3.m3(ld1, ad1, ad2, ad3);
}
        Output.points[8][1] += ad4;
        ab1 = ab2 && ab3;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld1, ad1);
}
if(ao4 != null){
          ab4 = ao4.m2();
}
        fb0 = ad2 < ad3;
if(fo1 != null){
          fo0 = fo1.m4(fb1, lb0, ab1, ab2);
}
        ad4 *= -1;
        fd0 *= -1;
        for(int i1=0; i1<10; i1++){
if(ao2 != null){
              ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld1, ad1, ad2, ab3, ab4, fb0, fb1);
}
}}
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
      fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
    Thought lo0 = Thought99.getInstance(fo0, fo1, fo0, fo1);
    double ld1 = 429.24408125596995;
    fd0 = fd1 + ld1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld1, fd0, fd1);
}
    ld1 = fd0 - fd1;
    fb1 = ld1 < fd0;
    fd1 = ld1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
}
    fb0 = ld1 < fd0;
    Thought lo2 = Thought137.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fd1 = ld1 - fd0;
    Thought lo3 = Thought268.getInstance(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, fb0, fb1, fb0, fb1);

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
    fd0 = fd1 + fd0;
    Thought lo0 = Thought102.getInstance(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    fd0 = fd1 - fd0;
    ab3 = fd1 < fd0;
    boolean lb1 = true;
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    ab2 = ab3 || ab4;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo4 = Thought239.getInstance(lb1, lb2, lb3, ab1);
    ab2 = ab3 && ab4;
    fb0 = fb1 || lb1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb2, lb3, ab1, ab2);
}
    fd0 = fd1 + fd0;
    Thought lo5 = Thought113.getInstance(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, lb2, lb3, ab1);
}
    Output.points[8][2] += fd1;
    ab2 = !ab3;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    double ld6 = 297.8013654149129;
if(fo1 != null){
      ld6 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld6, fd0);
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
    Output.points[8][3] += ad1;
    fb0 = ad2 < ad3;
    boolean lb0 = false;
    fb0 = fb1 && lb0;
    ad4 = fd0 - fd1;
    fb0 = fb1 && lb0;
    boolean lb1 = true;
    lb1 = ad1 < ad2;
    ad3 = ad4 - fd0;
    boolean lb2 = true;
if(fo1 != null){
      fo1.m3();
}
    lb2 = !fb0;
    fb1 = lb0 && lb1;
    boolean lb3 = false;
    if (lb2) {
if(fo0 != null){
          fo0.m2(lb3, fb0, fb1, lb0);
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
    fd0 *= -1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    fb1 = !ab1;
    fd0 = fd1 + ad1;
    Thought lo0 = Thought53.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fd1 > ad1;
    Thought lo2 = Thought12.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, lb1, ab1, ab2);
if(fo0 != null){
          fo1 = fo0.m4(fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, ab1, ab2, ab3);
}
    Thought lo3 = Thought223.getInstance(fo1, fo0, fo1, fo0);
    ab4 = fb0 || fb1;
    ad4 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    lb1 = ab1 || ab2;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo0.m1();
}
    Output.points[8][4] -= ad3;
if(fo1 != null){
      ad4 = fo1.m3(ab3, ab4, fb0, fb1);
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
    Thought lo0 = Thought122.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    Thought lo1 = Thought117.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    boolean lb2 = true;
    fd0 = fd1 - fd0;
    Output.points[8][5] -= fd1;
if(fo1 != null){
      lb2 = fo1.m2(ao1, ao2, ao3, ao4, fb0, fb1, lb2, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      fb1 = ao4.m2(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
    lb2 = !fb0;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad2 < ad3;
    ad4 = fd0 + fd1;
if(ao2 != null){
      ao2.m3();
}
if(ao4 != null){
      ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = ad1 + ad2;
    boolean lb0 = false;
if(fo0 != null){
      ao4 = fo0.m4(ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fb0 = ad1 < ad2;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 || fb1;
    for(int i0=0; i0<10; i0++){
        ad3 = ad4 + fd0;
        for(int i1=0; i1<10; i1++){
if(ao1 != null){
              fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
            double ld1 = 644.9630609535951;
            double ld2 = 382.7288413489369;
            lb0 = ad4 > fd0;
            fb0 = fd1 < ld1;
}}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
    ab1 = ab2 || ab3;
    boolean lb0 = true;
    ab3 = ab4 || fb0;
    boolean lb1 = true;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 && lb0;
    Thought lo2 = Thought170.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
    lb1 = !ab1;
    fd0 *= -1;
    ab2 = fd1 > fd0;
if(ao1 != null){
      ab3 = ao1.m2();
}
    fd1 = fd0 - fd1;
    boolean lb3 = false;
if(ao3 != null){
      ao2 = ao3.m4(ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      lb0 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, lb1, lb3, ab1, ab2);
}
    double ld4 = 999.3750491289351;
    boolean lb5 = false;
    Output.points[8][6] -= ld4;
    fd0 = fd1 - ld4;
    ab2 = ab3 && ab4;
    fb0 = !fb1;
    lb0 = fd0 > fd1;

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
    ad1 *= -1;
    Thought lo0 = Thought258.getInstance(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
    fb1 = ab1 || ab2;
    fd1 = ad1 - ad2;
    Thought lo1 = Thought161.getInstance(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    ab1 = !ab2;
if(ao1 != null){
      fo1 = ao1.m4(ad3, ad4, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    boolean lb2 = false;
if(ao2 != null){
      fd0 = ao2.m3();
}
    ab2 = ab3 && ab4;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, lb2, ab1);
}
    fd1 *= -1;
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb2);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb2;
    boolean lb3 = true;
    lb3 = ad4 < fd0;
    ab1 = ab2 || ab3;
    Thought lo4 = Thought360.getInstance(ao1, ao2, ao3, ao4, ab4, fb0, fb1, lb2);
    boolean lb5 = true;
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ao4.m2(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3);
}
    double ld6 = 253.34673777746113;

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
    Thought lo0 = Thought389.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    Thought lo1 = Thought212.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb2 = true;
    fd0 *= -1;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
    Output.points[8][7] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
    double ld3 = 466.863352608764;
    boolean lb4 = false;
    fd0 = fd1 - ld3;
    lb4 = fd0 < fd1;
    ld3 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb2, lb4);
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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    double ld0 = 29.76093407108784;
    ld0 *= -1;
if(fo0 != null){
          fb0 = fo0.m2(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
}
    fb1 = lb1 && fb0;
    fb1 = ld0 < fd0;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(fd1, ld0, fd0, fd1);
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m3();
}
    lb0 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, fb0, fb1);
}
    lb0 = !fb0;
    fb1 = !lb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fd0 *= -1;
if(fo0 != null){
      fb1 = fo0.m2(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = fd1 < fd0;
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    lb0 = fd0 < fd1;
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
}
